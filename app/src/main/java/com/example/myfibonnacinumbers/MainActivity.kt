package com.example.myfibonnacinumbers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager

import com.example.myfibonnacinumbers.databinding.ActivityMainBinding
import java.math.BigInteger


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    override fun onResume() {
        super.onResume()
       displayFibList()
    }



    fun getFibonacciList(count: Int): List<BigInteger>{
        val fibList = mutableListOf<BigInteger>(BigInteger.ZERO, BigInteger.ONE)

        while(fibList.size < count){
            var next = fibList[fibList.lastIndex] + fibList[fibList.lastIndex-1]
            fibList.add(next)

        }
        return fibList
    }

    fun displayFibList(){
        binding.fiboRecyclerView.layoutManager = LinearLayoutManager(this)
        val fibAdapter = FibonacciRVAdapter(getFibonacciList(100))
        binding.fiboRecyclerView.adapter = fibAdapter
    }



}