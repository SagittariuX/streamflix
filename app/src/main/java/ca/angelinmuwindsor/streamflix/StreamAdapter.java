package ca.angelinmuwindsor.streamflix;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.firebase.ui.firestore.FirestoreRecyclerAdapter;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;

public class StreamAdapter extends FirestoreRecyclerAdapter <StreamInfo, StreamAdapter.StreamHolder>{

    public StreamAdapter(@NonNull FirestoreRecyclerOptions<StreamInfo> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull StreamHolder holder, int position, @NonNull StreamInfo model) {
        holder.textViewTitle.setText(model.getStreamTitle());
        holder.textViewDescription.setText(model.getStreamDescription());
    }

    @NonNull
    @Override
    public StreamHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.stream_item,
                viewGroup, false);
        return new StreamHolder(v);
    }

    class StreamHolder extends RecyclerView.ViewHolder{
        TextView textViewTitle;
        TextView textViewDescription;

        public StreamHolder(View itemView) {
            super(itemView);
            textViewTitle = itemView.findViewById(R.id.text_view_title);
            textViewDescription = itemView.findViewById(R.id.text_view_description);

        }
    }
}
