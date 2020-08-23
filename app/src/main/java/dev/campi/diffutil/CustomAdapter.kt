package dev.campi.diffutil

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import dev.campi.diffutil.databinding.ItemViewBinding
import kotlinx.android.synthetic.main.item_view.view.*

class CustomAdapter(
    // le pasamos el listener al constructor par a
    private val onMensajeClic: OnMensajeClic
) :
    ListAdapter<Objeto, CustomAdapter.ObjetoViewHolder>(DiffCallback) {

    class ObjetoViewHolder(private val binding: ItemViewBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(accion: Objeto) {
            binding.objeto = accion
            binding.executePendingBindings()
        }
    }

    companion object DiffCallback : DiffUtil.ItemCallback<Objeto>() {
        override fun areItemsTheSame(oldItem: Objeto, newItem: Objeto): Boolean {
            return oldItem === newItem
        }

        override fun areContentsTheSame(oldItem: Objeto, newItem: Objeto): Boolean {
            return oldItem.id == newItem.id
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ObjetoViewHolder {
        return ObjetoViewHolder(ItemViewBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun onBindViewHolder(holder: ObjetoViewHolder, position: Int) {
        val accion = getItem(position)
        // listener para el menu guisante
        holder.itemView.tv_mensaje.setOnClickListener { message ->
            onMensajeClic.onClick(accion, message)
        }
        holder.bind(accion)
    }

    class OnMensajeClic(val clickListener: (obj: Objeto, itemView: View) -> Unit) {
        fun onClick(obj: Objeto, itemView: View) = clickListener(obj, itemView)
    }

}