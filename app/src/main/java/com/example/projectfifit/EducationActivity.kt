package com.example.projectfifit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class EducationActivity : AppCompatActivity() {

    lateinit var educationView: RecyclerView
    lateinit var educationAdapter: SchoolAdapter
    val list = ArrayList<SchoolData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_education)

        educationView = findViewById(R.id.rvEducation)
        educationView.layoutManager = LinearLayoutManager(this)

        list.add(SchoolData("SDN Sayung 2", "Sayung, Kec. Sayung, Kab.Demak"))
        list.add(SchoolData("Mts Nahdlatusy syubban", "Purwosari, Kec. Sayung, Kab.Demak"))
        list.add(SchoolData("SMKN 1 Sayung", "Onggorawe, Kec. Sayung, Kab.Demak"))

        educationAdapter = SchoolAdapter(list)
        educationView.adapter = educationAdapter
    }
}