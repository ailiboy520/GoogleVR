package com.google.vr.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.vr.R;

/**
 * ============================================================
 * Copyright：${TODO}有限公司版权所有 (c) 2017
 * Author：   AllenIverson
 * Email：    815712739@qq.com
 * GitHub：   https://github.com/JackChen1999
 * 博客：     http://blog.csdn.net/axi295309066
 * 微博：     AndroidDeveloper
 * GitBook：  https://www.gitbook.com/@alleniverson
 * <p>
 * Project_Name：GoogleVR
 * Package_Name：com.google.vr
 * Version：1.0
 * time：2016/3/10 0:49
 * des ：${TODO}
 * gitVersion：2.12.0.windows.1
 * updateAuthor：$Author$
 * updateDate：$Date$
 * updateDes：${TODO}
 * ============================================================
 */

public abstract class BaseFragment extends Fragment {

	private RecyclerView recyclerView;

	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		return inflater.inflate(R.layout.fragment_base,container,false);
	}

	@Override
	public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);
		recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
		RecyclerView.LayoutManager layoutManager = getLayoutManager();
		recyclerView.setLayoutManager(layoutManager);

		recyclerView.setAdapter(getAdatper());
	}
	public abstract RecyclerView.LayoutManager getLayoutManager();

	public abstract RecyclerView.Adapter getAdatper();
}
