package com.example.food_recipes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.facebook.shimmer.Shimmer
import com.todkars.shimmer.ShimmerRecyclerView


class RecipesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_recipes, container, false)
        val shimmerRecyclerView: ShimmerRecyclerView = view.findViewById(R.id.recycleView)
        shimmerRecyclerView.showShimmer()
        return view
    }



}