package com.fridjy.mareu.ui.meetings;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.fridjy.mareu.R;
import com.fridjy.mareu.data.model.Meeting;

import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

public class MeetingsAdapter extends RecyclerView.Adapter<MeetingsViewHolder> {

    public MeetingsClickListener mOnClickListener;
    private List<Meeting> mMeetings;

    public MeetingsAdapter(List<Meeting> meetings, MeetingsClickListener meetingsClickListener) {
        mOnClickListener = meetingsClickListener;
        setMeetings(meetings);
    }

    @NonNull
    @Override
    public MeetingsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.fragment_meetings_item, parent, false);

        return new MeetingsViewHolder(view, mOnClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull MeetingsViewHolder holder, int position) {
        holder.updateWithMeetingData(mMeetings.get(position));
    }

    @Override
    public int getItemCount() {
        return mMeetings.size();
    }

    public void updateData(List<Meeting> meetings) {
        setMeetings(meetings);
        notifyDataSetChanged();
    }

    private void setMeetings(List<Meeting> meetings) {
        mMeetings = checkNotNull(meetings);
    }

    public interface MeetingsClickListener {
        void deleteImageButtonOnClick(View v, int position);
    }

}
