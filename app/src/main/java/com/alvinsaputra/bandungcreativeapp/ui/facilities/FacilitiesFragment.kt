package com.alvinsaputra.bandungcreativeapp.ui.facilities

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.alvinsaputra.bandungcreativeapp.R
import com.alvinsaputra.bandungcreativeapp.databinding.FragmentFacilitiesBinding

class FacilitiesFragment : Fragment() {

    private var _binding: FragmentFacilitiesBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFacilitiesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val facilities = listOf(
            "Jalur Trekking dan Hiking",
            "Goa Jepang dan Goa Belanda",
            "Curug Omas (Air Terjun)",
            "Taman Bermain Anak",
            "Kebun Binatang Mini",
            "Pusat Informasi dan Edukasi",
            "Area Piknik dan Tempat Istirahat",
            "Menara Pandang",
            "Kafe dan Warung Makan",
        )

        binding.recyclerViewFacilities.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerViewFacilities.adapter = FacilitiesAdapter(facilities)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
