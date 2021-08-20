package com.neppplus.listviewpractice_20210820.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.neppplus.listviewpractice_20210820.R
import com.neppplus.listviewpractice_20210820.data.Country

class CountryAdapter(val mContext: Context, val resId: Int, val mList: ArrayList<Country>) : ArrayAdapter<Country>(mContext, resId, mList) {

    val mInflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView

        if (tempRow == null) {
            tempRow = mInflater.inflate(R.layout.country_list_item, null)
        }

        val row = tempRow!!

        val data = mList[position]

        val name = row.findViewById<TextView>(R.id.countryTxt)
        val capital = row.findViewById<TextView>(R.id.capitalTxt)
        val population = row.findViewById<TextView>(R.id.populationTxt)

        name.text = data.name
        capital.text = data.capital
        population.text = "${data.population}만명"

        return row
    }

}