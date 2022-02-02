package primeiro.cliente.recyclerviewaula;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    List<String> listaNomes = new ArrayList<>();
    public Adapter(List<String> lista) {
        this.listaNomes = lista;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = View.inflate(parent.getContext(), R.layout.adapter_lista,null);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        String texto = listaNomes.get(position);
        holder.textoNome.setText(texto);
    }

    @Override
    public int getItemCount() {
        return listaNomes.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView textoNome;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textoNome = itemView.findViewById(R.id.textNome);

        }
    }
}
