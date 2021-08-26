package com.example.himkhand.Home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.himkhand.R;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class HomeAdapter extends RecyclerView.Adapter {

    private Context context;
    private ArrayList<Home_Model> homeModelArrayList;


    public HomeAdapter(Context context, ArrayList<Home_Model> homeModelArrayList) {
        this.context = context;
        this.homeModelArrayList = homeModelArrayList;
    }

    @Override
    public int getItemViewType(int position) {
        switch (homeModelArrayList.get(position).getType()) {
            case 0:
                return Home_Model.STORY_LAYOUT;
            case 1:
                return Home_Model.HORIZONTAL_LAYOUT;
            case 2:
                return Home_Model.POPULAR_LAYOUT;
            case 3:
                return Home_Model.RECOM_RADIO_LAYOUT;
            case 4:
                return Home_Model.FRESH_HITS_LAYOUT;
            case 5 :
                return Home_Model.POPULAR_PODCAST_LAYOUT;

            default:
                return -1;
        }
    }

    @NonNull
    @NotNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        switch (viewType) {
            case Home_Model.STORY_LAYOUT:
                View storyView = LayoutInflater.from(parent.getContext()).inflate(R.layout.story_layout, parent, false);
                return new StoryViewHolder(storyView);

            case Home_Model.HORIZONTAL_LAYOUT:
                View horizontalView = LayoutInflater.from(parent.getContext()).inflate(R.layout.horizontal_recycler_layout, parent, false);
                return new HorizontalViewHolder(horizontalView);

            case Home_Model.POPULAR_LAYOUT:
                View popularView = LayoutInflater.from(parent.getContext()).inflate(R.layout.horizontal_recycler_layout, parent, false);
                return new PopularViewHolder(popularView);


            case Home_Model.RECOM_RADIO_LAYOUT:
                View radioView = LayoutInflater.from(parent.getContext()).inflate(R.layout.horizontal_recycler_layout, parent, false);
                return new RadioViewHolder(radioView);

            case Home_Model.FRESH_HITS_LAYOUT:
                View freshHitsView = LayoutInflater.from(parent.getContext()).inflate(R.layout.horizontal_recycler_layout, parent, false);
                return new FreshHitsViewHolder(freshHitsView);

            case Home_Model.POPULAR_PODCAST_LAYOUT:
                View podCastView = LayoutInflater.from(parent.getContext()).inflate(R.layout.podcast_recycler_layout, parent, false);
                return new PodCastViewHolder(podCastView);

            default:
                return null;
        }
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull RecyclerView.ViewHolder holder, int position) {

        switch (homeModelArrayList.get(position).getType()) {
            case Home_Model.STORY_LAYOUT:

                ModelAdapter adapter = new ModelAdapter(context, homeModelArrayList.get(position).getModelStoryArrayList());
                ((StoryViewHolder) holder).storyRecyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
                ((StoryViewHolder) holder).storyRecyclerView.setAdapter(adapter);
                adapter.notifyDataSetChanged();


                break;

            case Home_Model.HORIZONTAL_LAYOUT:


                ((HorizontalViewHolder) holder).title.setText(homeModelArrayList.get(position).getTitle_name());

                HorizontalAdapter horizontalAdapter = new HorizontalAdapter(context, homeModelArrayList.get(position).getHorizontalModelArrayList());
                ((HorizontalViewHolder) holder).horizontalRecyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
                ((HorizontalViewHolder) holder).horizontalRecyclerView.setAdapter(horizontalAdapter);
                horizontalAdapter.notifyDataSetChanged();

                ((HorizontalViewHolder) holder).viewAll.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                });

                break;

            case Home_Model.POPULAR_LAYOUT:
                ((PopularViewHolder) holder).title.setText(homeModelArrayList.get(position).getPopular_title());

                PopularAdapter popularAdapter = new PopularAdapter(context, homeModelArrayList.get(position).getPopularArtistArrayList());
                ((PopularViewHolder) holder).horizontalRecyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
                ((PopularViewHolder) holder).horizontalRecyclerView.setAdapter(popularAdapter);
                popularAdapter.notifyDataSetChanged();

                ((PopularViewHolder) holder).viewAll.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                    }
                });
                break;

            case Home_Model.RECOM_RADIO_LAYOUT:

                ((RadioViewHolder) holder).title.setText(homeModelArrayList.get(position).getRadio_title());

                AdapterRadio adapterRadio = new AdapterRadio(context, homeModelArrayList.get(position).getRadioModelArrayList());
                ((RadioViewHolder) holder).horizontalRecyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
                ((RadioViewHolder) holder).horizontalRecyclerView.setAdapter(adapterRadio);
                adapterRadio.notifyDataSetChanged();

                ((RadioViewHolder) holder).viewAll.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                });
                break;

            case Home_Model.FRESH_HITS_LAYOUT:

                ((FreshHitsViewHolder) holder).title.setText(homeModelArrayList.get(position).getFresh_hits_title());

                FreshHitsAdapter freshHitsAdapter = new FreshHitsAdapter(context, homeModelArrayList.get(position).getFreshHitsArrayList());
                ((FreshHitsViewHolder) holder).horizontalRecyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
                ((FreshHitsViewHolder) holder).horizontalRecyclerView.setAdapter(freshHitsAdapter);
                freshHitsAdapter.notifyDataSetChanged();

                ((FreshHitsViewHolder) holder).viewAll.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //   Toast.makeText(context.getApplicationContext(), "hi this is kavita thakur", Toast.LENGTH_SHORT).show();
                    }
                });

                break;

            case Home_Model.POPULAR_PODCAST_LAYOUT:

                ((PodCastViewHolder) holder).title.setText(homeModelArrayList.get(position).getPopular_podcast_title());

                AdapterPodCast adapterPodCast = new AdapterPodCast(context, homeModelArrayList.get(position).getModelPodCastArrayList());
                ((PodCastViewHolder) holder).horizontalRecyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
                ((PodCastViewHolder) holder).horizontalRecyclerView.setAdapter(adapterPodCast);
                adapterPodCast.notifyDataSetChanged();



            default:
                return;
        }
    }

    @Override
    public int getItemCount() {
        return homeModelArrayList.size();
    }

    public class StoryViewHolder extends RecyclerView.ViewHolder {
        RecyclerView storyRecyclerView;

        public StoryViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            storyRecyclerView = itemView.findViewById(R.id.story_recycler_view);
        }
    }

    public class HorizontalViewHolder extends RecyclerView.ViewHolder {
        TextView title, viewAll;
        RecyclerView horizontalRecyclerView;

        public HorizontalViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            horizontalRecyclerView = itemView.findViewById(R.id.horizontal_recycler_view);
            title = itemView.findViewById(R.id.title_name);
            viewAll = itemView.findViewById(R.id.tv_viewAll);

        }
    }

    public class PopularViewHolder extends RecyclerView.ViewHolder {

        TextView title, viewAll;
        RecyclerView horizontalRecyclerView;

        public PopularViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            horizontalRecyclerView = itemView.findViewById(R.id.horizontal_recycler_view);
            title = itemView.findViewById(R.id.title_name);
            viewAll = itemView.findViewById(R.id.tv_viewAll);
        }
    }

    public class RadioViewHolder extends RecyclerView.ViewHolder {

        TextView title, viewAll;
        RecyclerView horizontalRecyclerView;

        public RadioViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);

            horizontalRecyclerView = itemView.findViewById(R.id.horizontal_recycler_view);
            title = itemView.findViewById(R.id.title_name);
            viewAll = itemView.findViewById(R.id.tv_viewAll);
        }
    }

    public class FreshHitsViewHolder extends RecyclerView.ViewHolder {
        TextView title, viewAll;
        RecyclerView horizontalRecyclerView;

        public FreshHitsViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            horizontalRecyclerView = itemView.findViewById(R.id.horizontal_recycler_view);
            title = itemView.findViewById(R.id.title_name);
            viewAll = itemView.findViewById(R.id.tv_viewAll);
        }
    }
    public class PodCastViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        RecyclerView horizontalRecyclerView;
        public PodCastViewHolder(@NonNull View itemView) {
            super(itemView);
            horizontalRecyclerView = itemView.findViewById(R.id.podcast_recycler_view);
            title = itemView.findViewById(R.id.podcast_title_name);

        }
    }
}
