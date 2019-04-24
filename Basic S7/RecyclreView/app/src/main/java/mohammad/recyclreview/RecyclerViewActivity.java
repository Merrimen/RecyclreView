package mohammad.recyclreview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {
    RecyclerView recycler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        recycler = findViewById(R.id.recycler);

        CarModel car1 = new CarModel("pride","http://www.saipacorp.com/public/41646D696E6973747261746F72Images/Products/All/saipa/131/Photo04.jpg") ;
        CarModel car2 = new CarModel("p206 ","http://cloud.leparking.fr/2018/06/03/15/02/peugeot-206-206-tuning-2l-hdi_6292046314.jpg");
        CarModel car3 = new CarModel("xantia","https://parkers-images.bauersecure.com/pagefiles/189430/cut-out/600x400/xantia_hatch.jpg");
        CarModel car4 = new CarModel("samand","https://cars.ua/thumb/car/20171210/w933/h622/q80/kupit-iran-khodro-samand-cng-lx-harkov-557207.jpg");
        CarModel car5 = new CarModel("LX","https://fm.cnbc.com/applications/cnbc.com/resources/img/editorial/2018/08/03/105375492-1533327108779lexus-lx-570-1.jpg?v=1533327172");
        CarModel car6 = new CarModel("dena","https://img.favcars.com/iran-khodro/dena/iran-khodro_dena_2014_images_1_b.jpg");


        List<CarModel> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);

        CarListAdapter adapter = new CarListAdapter(this , cars);

        recycler.setAdapter(adapter);

    }

}
