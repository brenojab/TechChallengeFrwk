package com.framework.techchallengefrwk.ui.postagens

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.framework.techchallengefrwk.models.PostagensData
import com.framework.techchallengefrwk.models.PostsResult
import com.framework.techchallengefrwk.service.createService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PostagensViewModel : ViewModel() {

    val service = createService()
    var postList: MutableList<PostagensData>? = null

    fun initServices() {
        return service.getServices().enqueue(object : Callback<PostsResult> {

            override fun onFailure(call: Call<PostsResult>, t: Throwable) {
                // Tratar exceções
                Log.wtf("GET_DATA_ERROR", "Erro ao obter dados do serviço", t)
            }

            override fun onResponse(call: Call<PostsResult>, response: Response<PostsResult>) {
                val data = response.body()
                var list = data?.services as MutableList<PostagensData>
                postList = list
            }
        })
    }
}