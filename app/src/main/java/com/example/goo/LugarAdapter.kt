import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.goo.Lugar
import com.example.goo.databinding.ItemLugarBinding

class LugarAdapter(private val lugares: List<Lugar>, private val onItemClick: (Lugar) -> Unit) :
    RecyclerView.Adapter<LugarAdapter.LugarViewHolder>() {

    class LugarViewHolder(val binding: ItemLugarBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LugarViewHolder {
        val binding = ItemLugarBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return LugarViewHolder(binding)
    }

    override fun onBindViewHolder(holder: LugarViewHolder, position: Int) {
        val lugar = lugares[position]

        holder.binding.apply {
            nombreLugar.text = lugar.id
            rotacion.text = lugar.rotacion
            orbita.text = lugar.orbita

            root.setOnClickListener {
                onItemClick(lugar)
            }
        }
    }

    override fun getItemCount() = lugares.size
}