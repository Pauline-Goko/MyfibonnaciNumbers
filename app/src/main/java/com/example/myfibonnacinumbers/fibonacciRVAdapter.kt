package com.example.myfibonnacinumbers

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger

class FibonacciRVAdapter(var fiboList: List<BigInteger>):
    RecyclerView.Adapter<FibonacciRVAdapter.NumberViewHolder>()  {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent,
        false)
        return NumberViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        val number = fiboList.get(position)
        holder.tvNumber.text = number.toString()
    }


    override fun getItemCount(): Int {
        return fiboList.size
    }


  inner class NumberViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
      var tvNumber = itemView.findViewById<TextView>(R.id.tvNumber)


  }

}



