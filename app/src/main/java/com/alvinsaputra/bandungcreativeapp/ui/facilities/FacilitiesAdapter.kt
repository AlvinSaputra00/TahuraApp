package com.alvinsaputra.bandungcreativeapp.ui.facilities

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.alvinsaputra.bandungcreativeapp.databinding.ItemFacilityBinding

class FacilitiesAdapter(
    private val facilities: List<String>
) : RecyclerView.Adapter<FacilitiesAdapter.FacilityViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FacilityViewHolder {
        val binding = ItemFacilityBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FacilityViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FacilityViewHolder, position: Int) {
        holder.bind(facilities[position])
    }

    override fun getItemCount(): Int = facilities.size

    inner class FacilityViewHolder(private val binding: ItemFacilityBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(facility: String) {
            binding.facilityName.text = facility
            // Set icon or other properties if needed
        }
    }
}
