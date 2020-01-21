package app.myfirstproject.bestuniversitys;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

public class BestUniversitysActivity extends AppCompatActivity {

    String title[]={"AUAF","AUXFORD","BERLIN"};
    String description[]={"desc1","desc2","dest3"};
    int photos[]={R.drawable.ic_launcher_background,R.drawable.logo,R.drawable.photo};


    RecyclerView rvBestUni;
    LinearLayoutManager manager;
    BestUniAdapter BestUniAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.best_universitys);

        rvBestUni=findViewById(R.id.rvBestUni);
        manager=new LinearLayoutManager(BestUniversitysActivity.this,LinearLayoutManager.VERTICAL,false);
        rvBestUni.setLayoutManager(manager);

        BestUniAdapter=new BestUniAdapter(title,description,photos);
        rvBestUni.setAdapter(BestUniAdapter);
    }
}
