package com.example.himkhand.Search;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.himkhand.Home.AdapterRadio;
import com.example.himkhand.Home.FreshHitsAdapter;
import com.example.himkhand.Home.HomeAdapter;
import com.example.himkhand.Home.Home_Model;
import com.example.himkhand.Home.HorizontalAdapter;
import com.example.himkhand.Home.PopularAdapter;
import com.example.himkhand.R;

import java.util.ArrayList;

public class SearchAdapter extends RecyclerView.Adapter {

    private Context context;
    private ArrayList<SearchModel> searchModelArrayList;

    public SearchAdapter(Context context, ArrayList<SearchModel> searchModelArrayList) {
        this.context = context;
        this.searchModelArrayList = searchModelArrayList;
    }

    public int getItemViewType(int position){
        switch (searchModelArrayList.get(position).getType()){

            case 0:
                return SearchModel.SEARCH_HORIZONTAL_LAYOUT;

            case 1:
                return SearchModel.SEARCH_POPULAR_LAYOUT;

            case 2:
                return SearchModel.SEARCH_RECOM_RADIO_LAYOUT;

            case 3:
                return SearchModel.SEARCH_FRESH_HITS_LAYOUT;

            default:
            return -1;
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        switch (viewType){
            case SearchModel.SEARCH_HORIZONTAL_LAYOUT:
                View searchHorizontalView = LayoutInflater.from(parent.getContext()).inflate(R.layout.horizontal_recycler_layout, parent,false);
                return new HorizontalViewHolder(searchHorizontalView);

            case SearchModel.SEARCH_POPULAR_LAYOUT:
                View searchPopularView = LayoutInflater.from(parent.getContext()).inflate(R.layout.horizontal_recycler_layout, parent,false);
                return new PopularViewHolder(searchPopularView);

            case SearchModel.SEARCH_RECOM_RADIO_LAYOUT:
                View searchRadioView = LayoutInflater.from(parent.getContext()).inflate(R.layout.horizontal_recycler_layout, parent,false);
                return new RadioViewHolder(searchRadioView);

            case SearchModel.SEARCH_FRESH_HITS_LAYOUT:
                View searchFreshHitsView = LayoutInflater.from(parent.getContext()).inflate(R.layout.horizontal_recycler_layout, parent,false);
                return new FreshHitsViewHolder(searchFreshHitsView);

            default:
                return null;

        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        switch (searchModelArrayList.get(position).getType()) {

            case SearchModel.SEARCH_HORIZONTAL_LAYOUT:
            ((SearchAdapter.HorizontalViewHolder) holder).title.setText(searchModelArrayList.get(position).getTitle_name());

            HorizontalAdapter horizontalAdapter = new HorizontalAdapter(context, searchModelArrayList.get(position).getHorizontalModelArrayList());
            ((SearchAdapter.HorizontalViewHolder) holder).horizontalRecyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
            ((SearchAdapter.HorizontalViewHolder) holder).horizontalRecyclerView.setAdapter(horizontalAdapter);
            horizontalAdapter.notifyDataSetChanged();

            ((SearchAdapter.HorizontalViewHolder) holder).viewAll.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });

            break;

            case SearchModel.SEARCH_POPULAR_LAYOUT:
                ((SearchAdapter.PopularViewHolder) holder).title.setText(searchModelArrayList.get(position).getPopular_title());

                PopularAdapter popularAdapter = new PopularAdapter(context, searchModelArrayList.get(position).getPopularArtistArrayList());
                ((SearchAdapter.PopularViewHolder) holder).horizontalRecyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
                ((SearchAdapter.PopularViewHolder) holder).horizontalRecyclerView.setAdapter(popularAdapter);
                popularAdapter.notifyDataSetChanged();

                ((SearchAdapter.PopularViewHolder) holder).viewAll.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                });

                break;

            case SearchModel.SEARCH_RECOM_RADIO_LAYOUT:
                ((SearchAdapter.RadioViewHolder) holder).title.setText(searchModelArrayList.get(position).getRadio_title());

                AdapterRadio adapterRadio = new AdapterRadio(context, searchModelArrayList.get(position).getRadioModelArrayList());
                ((SearchAdapter.RadioViewHolder) holder).horizontalRecyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
                ((SearchAdapter.RadioViewHolder) holder).horizontalRecyclerView.setAdapter(adapterRadio);
                adapterRadio.notifyDataSetChanged();

                ((SearchAdapter.RadioViewHolder) holder).viewAll.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                });

                break;

            case SearchModel.SEARCH_FRESH_HITS_LAYOUT:
                ((SearchAdapter.FreshHitsViewHolder) holder).title.setText(searchModelArrayList.get(position).getFresh_hits_title());

                FreshHitsAdapter freshHitsAdapter = new FreshHitsAdapter(context, searchModelArrayList.get(position).getFreshHitsModelArrayList());
                ((SearchAdapter.FreshHitsViewHolder) holder).horizontalRecyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
                ((SearchAdapter.FreshHitsViewHolder) holder).horizontalRecyclerView.setAdapter(freshHitsAdapter);
                freshHitsAdapter.notifyDataSetChanged();

                ((SearchAdapter.FreshHitsViewHolder) holder).viewAll.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                });

                break;

        }
    }

    @Override
    public int getItemCount() {
        return searchModelArrayList.size();
    }

    public class HorizontalViewHolder extends RecyclerView.ViewHolder{

        TextView title, viewAll;
        RecyclerView horizontalRecyclerView;
        public HorizontalViewHolder(@NonNull View itemView) {
            super(itemView);
            horizontalRecyclerView = itemView.findViewById(R.id.horizontal_recycler_view);
            title = itemView.findViewById(R.id.title_name);
            viewAll = itemView.findViewById(R.id.tv_viewAll);
        }
    }

    public class PopularViewHolder extends RecyclerView.ViewHolder{
        TextView title, viewAll;
        RecyclerView horizontalRecyclerView;
        public PopularViewHolder(@NonNull View itemView) {
            super(itemView);
            horizontalRecyclerView = itemView.findViewById(R.id.horizontal_recycler_view);
            title = itemView.findViewById(R.id.title_name);
            viewAll = itemView.findViewById(R.id.tv_viewAll);
        }
    }

    private class RadioViewHolder extends RecyclerView.ViewHolder{
        TextView title, viewAll;
        RecyclerView horizontalRecyclerView;
        public RadioViewHolder(@NonNull View itemView) {
            super(itemView);
            horizontalRecyclerView = itemView.findViewById(R.id.horizontal_recycler_view);
            title = itemView.findViewById(R.id.title_name);
            viewAll = itemView.findViewById(R.id.tv_viewAll);
        }
    }
    private class FreshHitsViewHolder extends RecyclerView.ViewHolder{
        TextView title, viewAll;
        RecyclerView horizontalRecyclerView;
        public FreshHitsViewHolder(@NonNull View itemView) {
            super(itemView);
            horizontalRecyclerView = itemView.findViewById(R.id.horizontal_recycler_view);
            title = itemView.findViewById(R.id.title_name);
            viewAll = itemView.findViewById(R.id.tv_viewAll);
        }
    }
}
