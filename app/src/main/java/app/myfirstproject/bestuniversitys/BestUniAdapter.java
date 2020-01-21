package app.myfirstproject.bestuniversitys;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;



public class BestUniAdapter  extends RecyclerView.Adapter<BestUniAdapter.BestUniHolder> {

    String title[];
    String description[];
    int Photos[];



    public BestUniAdapter(String[] title, String[] description, int[] photos) {

        this.title = title;
        this.description = description;
        this.Photos =photos;
    }

    public BestUniHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //inflator change xml   view  to java
        //parent.getContext it mean in each page which i am in
        View UniView = LayoutInflater.from(parent.getContext()).inflate(R.layout.show_best_uni, parent, false);
        return new BestUniHolder(UniView);
    }

    public void onBindViewHolder(@NonNull BestUniHolder holder, int position) {


        holder.title.setText(title[position]);
        holder.description.setText(description[position]);
        holder.photo.setImageResource(Photos[position]);
    }

    public int getItemCount() {
        return title.length;
    }

    public class BestUniHolder extends RecyclerView.ViewHolder {


        TextView title;
        TextView description;
        ImageView photo;

        public  BestUniHolder(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.title);
            description = itemView.findViewById(R.id.description);
            photo = itemView.findViewById(R.id.photo);

        }
    }
}
