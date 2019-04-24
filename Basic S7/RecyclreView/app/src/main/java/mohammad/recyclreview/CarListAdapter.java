package mohammad.recyclreview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class CarListAdapter extends RecyclerView.Adapter<CarListAdapter.Holder> {

    Context mContext;
    List<CarModel> cars;

    public CarListAdapter(Context mContext, List<CarModel> cars) {
        this.mContext = mContext;
        this.cars = cars;
    }

    class Holder extends RecyclerView.ViewHolder{
        MyImageView img;
        TextView name;
        public Holder( View itemView) {
            super(itemView);
           img = itemView.findViewById(R.id.img);
           name = itemView.findViewById(R.id.name);
           img.setOnClickListener(V->{
               CarModel clickedItem = cars.get(getAdapterPosition());
               Toast.makeText(mContext, clickedItem.getName(), Toast.LENGTH_SHORT).show();
           });

        }
    }


    @NonNull
    @Override
    public CarListAdapter.Holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int type) {

        View row = LayoutInflater.from(mContext).inflate(R.layout.car_list_item,viewGroup,false);
        return new Holder(row);
    }

    @Override
    public void onBindViewHolder(@NonNull CarListAdapter.Holder holder, int position) {

        holder.img.load(cars.get(position).getImg());
        holder.name.setText(cars.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return cars.size();
    }
}
