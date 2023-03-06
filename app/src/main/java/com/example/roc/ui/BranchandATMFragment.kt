package com.example.roc.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.roc.R

class BranchandATMFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_branchand_a_t_m,container,false)

    }
    override  fun onViewCreated(view: View, savedInstanceState: Bundle?){
        val mywebview: WebView =view.findViewById(R.id.ba)
        mywebview.webViewClient= object: WebViewClient(){
            override fun shouldOverrideUrlLoading(
                view: WebView,
                url:String
            ): Boolean {
                view.loadUrl(url)
                return true
            }

        }
        mywebview.loadUrl("https://www.centenarybank.co.ug/index.php/branches/index")
        mywebview.settings.javaScriptEnabled
        mywebview.settings.allowContentAccess=true
        mywebview.settings.useWideViewPort=true
        mywebview.settings.domStorageEnabled=true
    }}
