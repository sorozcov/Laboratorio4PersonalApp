package com.example.mypersonalapplab4

import android.icu.util.ValueIterator
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button

import  kotlinx.android.synthetic.main.git_proyecto.*
class GitProyecto : Fragment() {
    private lateinit var myWebView: WebView
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        //returning our layout file
        //change R.layout.yourlayoutfilename for each of your fragments

        var v=inflater.inflate(com.example.mypersonalapplab4.R.layout.git_proyecto, container, false)
        myWebView=v.findViewById<WebView>(R.id.webView)

        return v;
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //you can set the title for your toolbar here for different fragments different titles
        activity!!.title = "Git Proyecto"
        myWebView.webViewClient = WebViewClient()
        nombreGit.text= MyApplication.nameGit.toString()
        myWebView.loadUrl(MyApplication.urlGit.toString())


    }
}