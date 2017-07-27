package com.mbo.rxmarvel.rxmarvel.characters;

import android.databinding.ObservableList;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mbo.rxmarvel.rxmarvel.common.ContractFragment;
import com.mbo.rxmarvel.rxmarvel.common.ListChangeListener;
import com.mbo.rxmarvel.rxmarvel.databinding.FragmentCharactersBinding;
import com.mbo.rxmarvel.rxmarvel.databinding.ItemCharacterBinding;


public class CharactersFragment extends ContractFragment<CharactersFragment.CharacterListViewModelProvider> {

    public static CharactersFragment newInstance() {
        return new CharactersFragment();
    }

    CharacterListViewModel characterListViewModel;
    CharacterAdapter characterAdapter;
    ListChangeListener<ObservableList<CharacterViewModel>> listChangeListener = new ListChangeListener<ObservableList<CharacterViewModel>>() {
        @Override
        public void onItemRangeInserted(ObservableList<CharacterViewModel> observableList, int positionStart, int itemCount) {
            if (observableList != characterListViewModel.characters) throw new AssertionError();
            characterAdapter.notifyItemRangeInserted(positionStart, itemCount);
        }
    };

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        characterListViewModel = getContract().getCharacterListViewModel();

        FragmentCharactersBinding binding = FragmentCharactersBinding.inflate(inflater);
        binding.setVm(characterListViewModel);

        characterAdapter = new CharacterAdapter();
        binding.characterRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        binding.characterRecyclerView.setAdapter(characterAdapter);

        // Set listener on the characters list to get notified of additions
        characterListViewModel.characters.addOnListChangedCallback(listChangeListener);

        return binding.getRoot();
    }

    class CharacterAdapter extends RecyclerView.Adapter<CharacterAdapter.CharacterViewHolder> {

        @Override
        public CharacterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return new CharacterViewHolder(ItemCharacterBinding.inflate(getLayoutInflater(), parent, false));
        }

        @Override
        public void onBindViewHolder(CharacterViewHolder holder, int position) {
            holder.bind(characterListViewModel.characters.get(position));
        }

        @Override
        public int getItemCount() {
            return characterListViewModel.characters.size();
        }

        class CharacterViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
            final ItemCharacterBinding binding;

            CharacterViewHolder(ItemCharacterBinding binding) {
                super(binding.getRoot());
                this.binding = binding;
                itemView.setOnClickListener(this);
            }

            void bind(CharacterViewModel viewModel) {
                binding.setVm(viewModel);
                binding.executePendingBindings(); // Always on an list item
            }

            @Override
            public void onClick(View view) {
                if (getAdapterPosition() != RecyclerView.NO_POSITION) {
                    getContract().onCharacterClicked(binding.getVm());
                }
            }
        }
    }

    public interface CharacterListViewModelProvider {
        CharacterListViewModel getCharacterListViewModel();

        void onCharacterClicked(CharacterViewModel viewModel);
    }
}
