package com.alvinsaputra.bandungcreativeapp.ui.reviews

import androidx.recyclerview.widget.RecyclerView
import com.alvinsaputra.bandungcreativeapp.databinding.ItemReviewBinding

class ReviewViewHolder(private val binding: ItemReviewBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(review: Review) {
        binding.userName.text = review.userName
        binding.userImage.setImageResource(review.userImage)
        binding.userReview.text = review.reviewText
        binding.reviewRating.rating = review.rating
        binding.reviewDate.text = review.reviewDate
    }
}
