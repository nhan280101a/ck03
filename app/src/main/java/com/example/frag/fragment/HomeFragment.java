package com.example.frag.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;

import com.example.frag.R;
import com.example.frag.fragment.itemTab1.BestSaleAdapter;
import com.example.frag.fragment.itemTab1.Photo2Adapter;
import com.example.frag.fragment.itemTab1.Photo3Adapter;
import com.example.frag.fragment.itemTab1.Photo4Adapter;
import com.example.frag.fragment.itemTab1.photo2;
import com.example.frag.model.Tour;
import com.google.android.material.tabs.TabLayout;



import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private View mView;
    private List<Tour> listitem;
    private BestSaleAdapter photo1Adapter;
    private Photo2Adapter photo2Adapter;
    private Photo3Adapter photo3Adapter;
    private Photo4Adapter photo4Adapter;
    private TabLayout tabLayout;

    private ArrayList<Tour> arrayList;
    private RecyclerView home1_viewpager1;
    private BestSaleAdapter adapter;



    public HomeFragment() {
        // Required empty public constructor
    }

    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_home, container, false);

        TabLayout tabLayout1 = (TabLayout) mView.findViewById(R.id.tab1layout1);

        TabLayout.Tab tab1 = tabLayout1.newTab();
        tab1.setText("H??? Long");
        tabLayout1.addTab(tab1,true);

        TabLayout.Tab tab2 = tabLayout1.newTab();
        tab2.setText("SaPa");
        tabLayout1.addTab(tab2,false);

        TabLayout.Tab tab3 = tabLayout1.newTab();
        tab3.setText("???? L???t");
        tabLayout1.addTab(tab3,false);

        TabLayout.Tab tab4 = tabLayout1.newTab();
        tab4.setText("Ph?? Qu???c");
        tabLayout1.addTab(tab4,false);

        TabLayout.Tab tab5 = tabLayout1.newTab();
        tab5.setText("Nha Trang");
        tabLayout1.addTab(tab5,false);


        TabLayout tabLayout2 = (TabLayout) mView.findViewById(R.id.tab1layout2);

        TabLayout.Tab tab6 = tabLayout2.newTab();
        tab6.setText("Tour tham quan");
        tabLayout2.addTab(tab6,true);

        TabLayout.Tab tab7 = tabLayout2.newTab();
        tab7.setText("Tour thi??n nhi??n");
        tabLayout2.addTab(tab7,false);

        TabLayout.Tab tab8 = tabLayout2.newTab();
        tab8.setText("Tour bi???n");
        tabLayout2.addTab(tab8,false);


        TabLayout tabLayout3 = (TabLayout) mView.findViewById(R.id.tab1layout3);

        TabLayout.Tab tab9 = tabLayout3.newTab();
        tab9.setText("H??n Qu???c");
        tabLayout3.addTab(tab9,true);

        TabLayout.Tab tab10 = tabLayout3.newTab();
        tab10.setText("Nh???t B???n");
        tabLayout3.addTab(tab10,false);

        TabLayout.Tab tab11 = tabLayout3.newTab();
        tab11.setText("Singapore");
        tabLayout3.addTab(tab11,false);

        TabLayout.Tab tab12 = tabLayout3.newTab();
        tab12.setText("Th??i Lan");
        tabLayout3.addTab(tab12,false);

        TabLayout.Tab tab13 = tabLayout3.newTab();
        tab13.setText("???n ?????");
        tabLayout3.addTab(tab13,false);

        TabLayout.Tab tab14 = tabLayout3.newTab();
        tab14.setText("Bali");
        tabLayout3.addTab(tab14,false);


        TabLayout tabLayout4 = (TabLayout) mView.findViewById(R.id.tab1layout4);

        TabLayout.Tab tab15 = tabLayout4.newTab();
        tab15.setText("??i???m ?????n n???i ?????a");
        tabLayout4.addTab(tab15,true);

        TabLayout.Tab tab16 = tabLayout4.newTab();
        tab16.setText("??i???m ?????n qu???c t???");
        tabLayout4.addTab(tab16,false);


         tabLayout1.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        return mView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initValue();

        home1_viewpager1 = view.findViewById(R.id.home1_viewpager1);
        home1_viewpager1.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false));
        home1_viewpager1.hasFixedSize();
        BestSaleAdapter adapter = new BestSaleAdapter(getContext(),arrayList);
        home1_viewpager1.setAdapter(adapter);
        adapter.notifyDataSetChanged();

        listitem=new ArrayList<>();
       // photo1Adapter = new Photo1Adapter(this,getListPhoto1());
        photo2Adapter = new Photo2Adapter(this,getListPhoto2());
        photo3Adapter = new Photo3Adapter(this,getListPhoto3());
        photo4Adapter = new Photo4Adapter(this,getListPhoto4());

        /*RecyclerView rcv1 = view.findViewById(R.id.home1_viewpager1);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL,false);
        rcv1.setLayoutManager(layoutManager);
        photo1Adapter.setData(getListPhoto1());
        rcv1.setAdapter(photo1Adapter);
        SnapHelper startSnapHelper1 = new LinearSnapHelper();
        startSnapHelper1.attachToRecyclerView(rcv1);*/

        RecyclerView rcv2 = view.findViewById(R.id.home1_viewpager2);
        RecyclerView.LayoutManager layoutManager2 = new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL,false);
        rcv2.setLayoutManager(layoutManager2);
        rcv2.setAdapter(photo2Adapter);
        SnapHelper startSnapHelper2 = new LinearSnapHelper();
        startSnapHelper2.attachToRecyclerView(rcv2);

        RecyclerView rcv3 = view.findViewById(R.id.home1_viewpager3);
        RecyclerView.LayoutManager layoutManager3 = new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL,false);
        rcv3.setLayoutManager(layoutManager3);
        rcv3.setAdapter(photo3Adapter);
        SnapHelper startSnapHelper3 = new LinearSnapHelper();
        startSnapHelper3.attachToRecyclerView(rcv3);

        RecyclerView rcv4 = view.findViewById(R.id.home1_viewpager4);
        RecyclerView.LayoutManager layoutManager4 = new GridLayoutManager(getActivity(),2);
        rcv4.setLayoutManager(layoutManager4);
        rcv4.setAdapter(photo4Adapter);
        SnapHelper startSnapHelper4 = new LinearSnapHelper();
        startSnapHelper4.attachToRecyclerView(rcv4);


    }

    private void initValue() {
        arrayList = new ArrayList<>();
        arrayList.add(new Tour(R.drawable.a1,"Tour du l???ch Nam C??t Ti??n 2N1D","2 ng??y 1 ????m","C??t Ti??n", "H??? Ch?? Minh","Ph????ng ti???n: Xe 29 ch??? ?????i m???i, b??ng ????i, gh??? b???t, m??y l???nh, ?????t ti??u chu???n du l???ch.\n" +
                "L??u tr??: Ti??u chu???n 2 ng?????i/ph??ng: m??y l???nh, tivi, toilet ri??ng, wifi,...\n" +
                "??n u???ng:\n" +
                "02 bu???i ??n s??ng.\n" +
                "02 bu???i ??n ch??nh ( ??n tr??a, t???i ): 150.000??/kh??ch th???c ????n 5-6 m??n thay ?????i theo t???ng b???a ??n.\n" +
                "01 b???a ti???c n?????ng BBQ menu ????nh k??m.\n" +
                "H?????ng d???n vi??n: ??o??n c?? h?????ng d???n vi??n thuy???t minh nhi???t t??nh v?? ph???c v??? ??n, ngh???, tham quan cho qu?? kh??ch. Ho???t n??o vi??n t??? ch???c c??c tr?? ch??i v???n ?????ng t???p th???, sinh ho???t, ca h??t.\n" +
                "T??? ch???c ch????ng tr??nh teambuilding cho ??o??n.\n" +
                "B???o hi???m: Kh??ch ???????c b???o hi???m du l???ch tr???n g??i, m???c b???i th?????ng t???i ??a 30.000.000??/v???. Thu???c y t??? th??ng th?????ng.\n" +
                "Qu?? t???ng: M???i v??? kh??ch tr??n ???????ng ??i ???????c ph???c v??? 1 kh??n l???nh, 1 chai n?????c tinh khi???t/ ng??y / ng?????i, n??n qu?? l??u ni???m c??ng ty.\n" +
                "Tham quan: Gi?? tour bao g???m ph?? v??o c???ng t???i c??c ??i???m tham quan n??u tr??n ch????ng tr??nh, ????m h???i l???a tr???i:\n" +
                "V?? v??o v?????n qu???c gia\n" +
                "Xe ?????p\n" +
                "Ph?? tham quan B??u S???u\n" +
                "L???a tr???i: ?????ng c???i, MC ho???t n??o d???n ch????ng tr??nh. Ngo??i ra t???ng th??m qu?? kh??ch h??ng 10 tr??i b???p v?? 10 c??? khoai.","1.850.000 VND"));
        arrayList.add(new Tour(R.drawable.a2,"Tour du l???ch ?????o ?? ?????ng Tr?????ng","1 ng??y","vfv","df","Chi ph?? v???n chuy???n: Xe du l???ch ?????i m???i ????a ????n tham quan su???t tuy???n.\n" +
                "Kh??ch s???n 3 sao theo ti??u chu???n: Ph??ng 2 ??? 3-4/ng?????i.\n" +
                "02 b???a s??ng\n" +
                "04 b???a ch??nh ?????c s???n theo ch????ng tr??nh ( th???c ????n ????nh k??m )\n" +
                "H?????ng d???n vi??n chuy??n nghi???p, nhi???t t??nh, chu ????o ph???c v??? su???t tuy???n.\n" +
                "Ph?? tham quan theo ch????ng tr??nh.\n" +
                "Qu?? t???ng: N??n du l???ch Kh??n l???nh, N?????c su???i 1 chai / 1 ng??y / 1 ng?????i.\n" +
                "B???o hi???m du l???ch su???t chuy???n tham quan 30.000.000 ?????ng/v??? .","1.400.000 VND"));
        arrayList.add(new Tour(R.drawable.a3,"Du l???ch ???? L???t","2 ng??y","???? L???t","H??? Ch?? Minh", "V???n chuy???n: Xe du l???ch 29-45 ch??? ?????i m???i ph???c v??? su???t tuy???n.\n" +
                "V?? tham quan: V?? c??c ??i???m tham quan theo l???ch tr??nh\n" +
                "L??u tr??: Kh??ch s???n 2-3 sao ti??u chu???n 2 - 4 ??? 6 kh??ch/ 1 ph??ng\n" +
                "??n u???ng\n" +
                "??n s??ng: 02 b???a t?? ly v?? 02 b???a Buffet s??ng.\n" +
                "??n ch??nh: 05 b???a th???c ????n 110.000vn??/pax\n" +
                "B???o hi???m 30.000.000 ??/ng?????i/tr?????ng h???p (ch??? ??p d???ng cho nh???ng kh??ch ho??n t???t th??? t???c ????ng k?? tour tr?????c kh???i h??nh 1 ng??y, kh??ng bao g???m c??c ng??y ngh??? cu???i tu???n v?? c??c ng??y ngh??? l???, T???t)\n" +
                "H?????ng d???n vi??n HDV nhi???t t??nh, kinh nghi???m, vui v??? ph???c v??? chu ????o\n" +
                "N?????c su???i, kh??n l???nh,n??n N?????c su???i: 1 chai 500ml/ng??y/kh??ch Kh??n l???nh: 1 c??i/ng??y/kh??ch\n" +
                "N??n du l???ch: 1 n??n/kh??ch","1.750.000 VND"));
        arrayList.add(new Tour(R.drawable.a4,"Nha Trang","gdh","dfgdf","fdgd","item1","2.400.000"));
        arrayList.add(new Tour(R.drawable.a5,"Sa Pa","gdh","dfgdf","fdgd","item1","3.000.000"));
        arrayList.add(new Tour(R.drawable.a6,"Vung Tau","gdh","dfgdf","fdgd","item1","1.000.000"));
    }

    private List<photo2> getListPhoto1 () {
        List<photo2> list = new ArrayList<>();
        list.add(new photo2(R.drawable.a1,"item1","5.000.000"));
        list.add(new photo2(R.drawable.a2,"item1","5.000.000"));
        list.add(new photo2(R.drawable.a3,"item1","5.000.000"));
        list.add(new photo2(R.drawable.a4,"item1","5.000.000"));
        list.add(new photo2(R.drawable.a5,"item1","5.000.000"));
        list.add(new photo2(R.drawable.a6,"item1","5.000.000"));
        return list;
    }

    private List<photo2> getListPhoto2 () {
        List<photo2> list = new ArrayList<>();
        list.add(new photo2(R.drawable.a1,"item1","5.000.000"));
        list.add(new photo2(R.drawable.a2,"item1","5.000.000"));
        list.add(new photo2(R.drawable.a3,"item1","5.000.000"));
        list.add(new photo2(R.drawable.a4,"item1","5.000.000"));
        list.add(new photo2(R.drawable.a5,"item1","5.000.000"));
        list.add(new photo2(R.drawable.a6,"item1","5.000.000"));
        return list;
    }

    private List<photo2> getListPhoto3 () {
        List<photo2> list = new ArrayList<>();
        list.add(new photo2(R.drawable.a1,"item1","5.000.000"));
        list.add(new photo2(R.drawable.a2,"item1","5.000.000"));
        list.add(new photo2(R.drawable.a3,"item1","5.000.000"));
        list.add(new photo2(R.drawable.a4,"item1","5.000.000"));
        list.add(new photo2(R.drawable.a5,"item1","5.000.000"));
        list.add(new photo2(R.drawable.a6,"item1","5.000.000"));
        return list;
    }

    private List<photo2> getListPhoto4 () {
        List<photo2> list = new ArrayList<>();
        list.add(new photo2(R.drawable.a1,"item1","5.000.000"));
        list.add(new photo2(R.drawable.a2,"item1","5.000.000"));
        list.add(new photo2(R.drawable.a3,"item1","5.000.000"));
        list.add(new photo2(R.drawable.a4,"item1","5.000.000"));
        list.add(new photo2(R.drawable.a5,"item1","5.000.000"));
        list.add(new photo2(R.drawable.a6,"item1","5.000.000"));
        return list;
    }


}
