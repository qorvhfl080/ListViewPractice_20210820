package com.neppplus.listviewpractice_20210820

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.neppplus.listviewpractice_20210820.adapter.CountryAdapter
import com.neppplus.listviewpractice_20210820.data.Country
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val countryList = ArrayList<Country>()

    lateinit var countryAdapter: CountryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        countryList.add(Country("대한민국", "서울", 5182))
        countryList.add(Country("미국", "워싱턴 D.C.", 33291))
        countryList.add(Country("캐나다", "오타와", 3806))
        countryList.add(Country("러시아", "모스크바", 14591))
        countryList.add(Country("인도", "뉴델리", 139340))
        countryList.add(Country("일본", "도쿄", 12605))
        countryList.add(Country("중국", "베이징", 144421))
        countryList.add(Country("프랑스", "파리", 6542))
        countryList.add(Country("영국", "런던", 6820))
        countryList.add(Country("브라질", "브라질리아", 21399))
        countryList.add(Country("태국", "방콕", 6995))

        countryAdapter = CountryAdapter(this, R.layout.country_list_item, countryList)

        countryListView.adapter = countryAdapter

        countryListView.setOnItemClickListener { adapterView, view, position, l ->

            val clickedCountry = countryList[position]

            Toast.makeText(this, "${clickedCountry.name} 눌림", Toast.LENGTH_SHORT).show()

        }

        countryListView.setOnItemLongClickListener { adapterView, view, position, l ->

            val clickedCountry = countryList[position]

            Toast.makeText(this, "${clickedCountry.name} 길게 눌림", Toast.LENGTH_SHORT).show()

            return@setOnItemLongClickListener true

        }

    }
}