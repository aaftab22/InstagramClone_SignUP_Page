import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class storyAdapter extends RecyclerView.Adapter<storyAdapter.storyViewholder> {

    private list<story> stories;

    public storyAdapter(list<story> stories) {
        this.stories = stories;
    }

    @NonNull
    @Override
    public storyViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull storyViewholder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return stories.size();
    }

    //view holder
    public static class storyViewholder extends RecyclerView.ViewHolder{
        public storyViewholder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
