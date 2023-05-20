package com.example.cardviewrecycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {

    // Paso 1


    List<Peliculas> lstPeliculas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        lstPeliculas = new ArrayList<>();


        // Pelicula 1
       lstPeliculas.add(new Peliculas(
               "Gato Con Botas",
               "Animacion",
               "Everyone's favorite leche-loving, swashbuckling, fear-defying feline, Puss in Boots, returns in a new adventure from the Shrek universe as the daring outlaw discovers that his passion for peril and disregard for safety have taken their toll",
               R.drawable.img1
       ));
        lstPeliculas.add(new Peliculas(
                "Shrek the Third",
                "Comedy",
                "The greatest fairy tale never told continues when Shrek (Mike Myers) embarks on another whirlwind adventure with Donkey (Eddie Murphy) and Puss In Boots (Antonio Banderas) to find the rightful heir to the throne. Meet the magical misguided Merlin (Eric Idle), an awkward Arthur (Justin Timberlake), and a powerful posse of princesses in a tale where everyone lives happily ever laughter.",
                R.drawable.img2
                ));

        lstPeliculas.add(new Peliculas(
                "Bee Movie",
                "Animation",
                "A hit comedy from comic icon Jerry Seinfeld, an ambitious young worker bee Barry B. Benson (Seinfeld) soars out into the world in search of nectar and adventure.",
                R.drawable.img3
                ));
        lstPeliculas.add(new Peliculas(
                "Kung Fu Panda 2",
                "Animation",
                "Jack Black is back as Po in this fiercely funny sequel. In his biggest challenge since becoming the Dragon Warrior, Po must lead his fellow kung fu masters, The Furious Five, on a mission of epic proportions to defeat his most threatening rival yet. KUNG FU PANDA 2 packs a powerful punch that combines non-stop action, beautiful storytelling and stunning animation in an all-new, awesome adventure!",
                R.drawable.img4
        ));
        lstPeliculas.add(new Peliculas(
                "Road to El Dorado",
                "Action & Andventure",
                "Tulio (Kevin Kline), Miguel (Kenneth Branagh) and their hilarious horse Altivo are in search of treasure on the legendary Lost City of Gold when they are mistaken for gods and lavished with riches beyond their wildest dreams. As friendship, loyalty and greed collide, they must make the decision of their lives: run off with the gold, or face risks and dangers to save the people of El Dorado!",
                R.drawable.img5
        ));

        lstPeliculas.add(new Peliculas(
                "How to Train Your Dragon",
                "Animation",
                "This Academy Award®-nominated DreamWorks Animation film rolls fire-breathing action, epic adventure and big laughs into a captivating, fun and original story. Hiccup is a young Viking who defies tradition and befriends one of his deadliest foes – a ferocious dragon he calls Toothless. Together, the unlikely heroes fight against the odds to save both their worlds in this wonderful, feel-good hit.",
                R.drawable.img6
        ));
        lstPeliculas.add(new Peliculas(
                "Plane",
                "Action && Adventure",
                "In the white-knuckle action movie Plane, pilot Brodie Torrance (Gerard Butler) saves his passengers from a lightning strike by making a risky landing on a war-torn island - only to find that surviving the landing was just the beginning.",
                R.drawable.img7
                ));
        lstPeliculas.add(new Peliculas(
                "Turbulence",
                "Action && Adventure",
                "After a shootout on a flight transporting prisoners, a stewardess must outwit a smooth-talking serial killer and land the plane herself.",
                R.drawable.img8
        ));

        lstPeliculas.add(new Peliculas(
                "Air Force One",
                "Action && Adventure",
                "Harrison Ford and Gary Oldman star in Wolfgang Petersen's thriller about the hijacking of Air ForceOne with the First Family on board. (Original Title - Air Force One) © 1997 Beacon Communications Corp. All Rights Reserved.",
                R.drawable.img9
                ));

        RecyclerView myrw = (RecyclerView)findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myadapter = new RecyclerViewAdapter(this, lstPeliculas);
        myrw.setLayoutManager(new GridLayoutManager(this, 3));
        myrw.setAdapter(myadapter);






    }
}