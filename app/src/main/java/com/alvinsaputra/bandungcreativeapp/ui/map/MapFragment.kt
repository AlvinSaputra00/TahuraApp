package com.alvinsaputra.bandungcreativeapp.ui.map

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import org.osmdroid.config.Configuration
import org.osmdroid.util.GeoPoint
import org.osmdroid.views.MapView
import org.osmdroid.views.overlay.Marker
import com.alvinsaputra.bandungcreativeapp.R

class MapFragment : Fragment() {

    private lateinit var mapView: MapView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_map, container, false)
        mapView = rootView.findViewById(R.id.mapView)
        setupMap()
        return rootView
    }

    private fun setupMap() {
        // Load OpenStreetMap configuration
        Configuration.getInstance().load(requireContext(), requireActivity().getPreferences(0))
        mapView.setMultiTouchControls(true)
        mapView.controller.setZoom(15.0)
        val startPoint = GeoPoint(-6.858397, 107.630701) // Koordinat Taman Hutan Raya Ir. H. Djuanda
        mapView.controller.setCenter(startPoint)

        val marker = Marker(mapView)
        marker.position = startPoint
        marker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM)
        marker.title = "Taman Hutan Raya Ir. H. Djuanda\nJam Buka: 08.00 - 16.00"
        mapView.overlays.add(marker)
    }

    override fun onResume() {
        super.onResume()
        mapView.onResume() // needed for compass, my location overlays, v6.0.0 and up
    }

    override fun onPause() {
        super.onPause()
        mapView.onPause() // needed for compass, my location overlays, v6.0.0 and up
    }
}
