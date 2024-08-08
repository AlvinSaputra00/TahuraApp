package com.alvinsaputra.bandungcreativeapp.ui.reviews

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.alvinsaputra.bandungcreativeapp.R
import com.alvinsaputra.bandungcreativeapp.databinding.FragmentReviewsBinding

class ReviewsFragment : Fragment() {

    private lateinit var binding: FragmentReviewsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentReviewsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Setup social media icons
        binding.facebookIcon.setOnClickListener {
            openLink("https://www.facebook.com/tahura.djuanda.5/")
        }

        binding.youtubeIcon.setOnClickListener {
            openLink("https://www.youtube.com/channel/UCYtpbu60yESl-TP4Zm7vskQ")
        }

        binding.instagramIcon.setOnClickListener {
            openLink("https://www.instagram.com/tahuradjuanda.official/")
        }

        // Setup RecyclerView
        val reviews = listOf(
            Review("Iin Riantini", R.drawable.ic_akun, "Cocok untuk tracking tipis2 tapi harus pagi2 biar dapat udara segar dan dinginnya hutan. Waktu itu saya parkir di pos dua jadi hanya bisa lihat mulai dari gua Belanda sampe Curug Omas. Di gua Belanda juga sebagai jalan pintas. Sebelum sampe Curug Omas ada warung Bu Kokom rekomen perkedelnya garing diluar lembut didalam. Namun harus hati2 banyak monyet berkeliaran disekitar warung.", 5.0f, "sebulan lalu"),
            Review("Agus Setiawan", R.drawable.ic_akun, "Best place untuk tracking dengan mudah! Sekarang jalannya udah di cor jadi lebih nyaman, yaa meskipun mengurangi vibes hutannya hehe", 4.5f, "2 minggu lalu"),
            Review("Siti Nurhaliza", R.drawable.ic_akun, "Enak buat jalan jalan, air nya dingin pooool, jalan nya udh bagus sekaranggg gak tanah becek lg. Tiket masuk nya murah jugaaa", 4.0f, "3 minggu lalu"),
            Review("Budi Santoso", R.drawable.ic_akun, "Cocok untuk tracking santai bareng keluarga, teduh sepanjang jalan, jalan setapaknya sudah bagus meski di beberapa tempat agak licin. Di beberapa tempat ada monyetnya tapi tidak ganas, sepertinya sudah terbiasa dgn kehadiran manusia.", 5.0f, "sehari lalu"),
            Review("Rina Marlina", R.drawable.ic_akun, "Tempatnya nyaman, adem, tentram, cocok untuk liburan keluarga. Terutama yang ingin trekking bisa ke sini, PP dari tempat parkir ke Curug Omas sekitar 10 km.", 4.8f, "4 hari lalu")
        )

        binding.recyclerView.layoutManager = LinearLayoutManager(context)
        binding.recyclerView.adapter = ReviewsAdapter(reviews)
    }

    private fun openLink(url: String) {
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(url)
        startActivity(intent)
    }
}
