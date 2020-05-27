package android.latihan.my_finance.view

import android.latihan.my_finance.R
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class addEditTransaksi : AppCompatActivity(), AdapterView.OnItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.add_item_transaksi)

        // Dummy spinner date
        val spinnerDate: Spinner = findViewById(R.id.spinnerAddDate)
        ArrayAdapter.createFromResource(
            this,
            R.array.Date,
            android.R.layout.simple_spinner_dropdown_item
        ).also {adapter->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinnerDate.adapter = adapter
        }

        // Dummy spinner type
        val spinnerType: Spinner = findViewById(R.id.spinnerAddType)
        ArrayAdapter.createFromResource(
            this,
            R.array.Type,
            android.R.layout.simple_spinner_dropdown_item
        ).also {adapter->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinnerType.adapter = adapter
        }

        // Dummy spinner category
        val spinnerCategory: Spinner = findViewById(R.id.spinnerAddCateg)
        ArrayAdapter.createFromResource(
            this,
            R.array.Category,
            android.R.layout.simple_spinner_dropdown_item
        ).also {adapter->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinnerCategory.adapter = adapter
        }
    }

    override fun onItemSelected(parent: AdapterView<*>, view: View, pos: Int, id: Long) {
    }

    override fun onNothingSelected(parent: AdapterView<*>) {
    }

}