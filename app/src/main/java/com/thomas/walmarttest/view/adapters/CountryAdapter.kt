package com.thomas.walmarttest.view.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.thomas.walmarttest.databinding.ViewHolderCountryBinding
import com.thomas.walmarttest.model.Country
import com.thomas.walmarttest.view.viewholders.CountryViewHolder

class CountryAdapter(private val countries: List<Country>): Adapter<CountryViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ViewHolderCountryBinding.inflate(inflater, parent, false)
        return CountryViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) = holder.bind(countries[position])

    override fun getItemCount() = countries.size
}