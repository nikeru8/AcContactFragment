package com.hello.kaiser.test;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class MyFragment extends android.app.Fragment {

    private RecyclerView mRecyclerView;
    View view;

    private TestAdapter mAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_fragment, container, false);
        initView();
        initSet();

        return view;
    }

    private void initView() {
        mRecyclerView = (RecyclerView) view.findViewById(R.id.fragment_recyclerview);
    }

    private void initSet() {
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(llm);

        mAdapter = new TestAdapter();
        mAdapter.setData();//加入資料

        mRecyclerView.setAdapter(mAdapter);

    }

    public void refreshData() {
        mAdapter.setData();
    }


}
