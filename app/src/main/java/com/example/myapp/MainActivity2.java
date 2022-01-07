package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    private ArrayList<String> fotoMakanan = new ArrayList<>();
    private ArrayList<String> namaMakanan = new ArrayList<>();
    private ArrayList<String> infoMakanan = new ArrayList<>();
    private ArrayList<String> hargaMakanan = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        getDataFromInternet();
    }

    private void prosesRecyclerViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(fotoMakanan, namaMakanan, infoMakanan, hargaMakanan, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void getDataFromInternet(){

        namaMakanan.add("Sego Megono");
        fotoMakanan.add("https://ik.imagekit.io/tvlk/cul-asset/C8Kj5-dCnE75BMxGpYYdcJVuEQbV3CnmF8ONfpQKM2n9jzSxIGG5kZNhhHY-p7nw/v2/culinary-asset/guys1L+Yyer9kzI3sp/pb0CG1j2bhflZGFUZOoIf1YMmzMd/HaD8U/YhZI+EvjMM+6RmcSU0aUVNGx3wRqN5pDQUjngkOwdYc7NgEANR/XLvc8LDz+xtXd7TWMQRzajCRWRwMP1QDWjfbIjKe1wGtKrw9sB5BKk6neb44N2yYwo=?tr=q-40,c-at_max,w-1080,h-1920&_src=imagekit");
        infoMakanan.add("Nasi Megono terdiri atas nasi yang diatasnya diberikan cacahan nangka muda yang dicampur dengan parutan kelapa beserta bumbu-bumbu lainnya. Nasi megono biasa disajikan dengan mendoan yaitu tempe goreng tipis bertepung yang setengah matang.");
        hargaMakanan.add("15000");

        namaMakanan.add("Mie Kocok Bandung");
        fotoMakanan.add("https://makananoleholeh.com/wp-content/uploads/2018/10/Mie-kocok-bandung.jpg");
        infoMakanan.add("Mie kocok merupakan makanan khas dari kota bandung yang memiliki rasa segar, gurih, dan juga nikmat.");
        hargaMakanan.add("15000");

        namaMakanan.add("Ayam Betutu Bali");
        fotoMakanan.add("https://makananoleholeh.com/wp-content/uploads/2018/10/ayam-betutu-bali.jpg");
        infoMakanan.add("Rasa ayam yang lembut dan juga kaya akan rempah akan membuat pengalaman anda selama di bali semakin terasa lengkap dan tak terlupakan.");
        hargaMakanan.add("25000");

        namaMakanan.add("Papeda Irian Jaya");
        fotoMakanan.add("https://makananoleholeh.com/wp-content/uploads/2018/10/Papeda-irian-jaya.jpg");
        infoMakanan.add("Makanan ini begitu unik karena memiliki tekstur seperti lem yang lengket.");
        hargaMakanan.add("10000");

        namaMakanan.add("Rendang Padang");
        fotoMakanan.add("https://makananoleholeh.com/wp-content/uploads/2018/10/Rendang-padang.jpg");
        infoMakanan.add("Makanan ini begitu unik karena memiliki tekstur seperti lem yang lengket.");
        hargaMakanan.add("17000");

        namaMakanan.add("Tinutuan Manado");
        fotoMakanan.add("https://makananoleholeh.com/wp-content/uploads/2018/10/Tinutuan-Manado.jpg");
        infoMakanan.add(" Makanan ini ini memiliki rasa yang sangat nikmat bahkan bisa dikatakan sebagai bubur yang paling nikmat yang pernah ada di Indonesia.");
        hargaMakanan.add("20000");

        namaMakanan.add("Gudeg Jogja");
        fotoMakanan.add("https://makananoleholeh.com/wp-content/uploads/2018/10/Gudeg-jogja-enak.jpg");
        infoMakanan.add("nangka muda yang dimasak dengan rempah yang lengkap dan juga diberi gula merah sehingga rasanya manis.");
        hargaMakanan.add("20000");

        namaMakanan.add("Pempek Palembang");
        fotoMakanan.add("https://makananoleholeh.com/wp-content/uploads/2018/10/Pempek-palembang.jpg");
        infoMakanan.add("Pempek terbuat dari ikan dan tepung kemudian dinikmati dengan kuah cuka yang dicampur gula dan garam sedikit.");
        hargaMakanan.add("15000");

        namaMakanan.add("Bungeoppang");
        fotoMakanan.add("https://cdn.idntimes.com/content-images/community/2019/12/retina-pixta-34774030-m-f7cfec5a8472d54e8a8e3631dbfdec0c_600x400.jpg");
        infoMakanan.add("Bungeo-ppang adalah kue serupa wafel dengan bentuk ikan mas yang populer di Korea. Bungeo-ppang terasa manis legit karena diisi pasta kacang merah.");
        hargaMakanan.add("18000");

        namaMakanan.add("Jjajangmyeon");
        fotoMakanan.add("https://www.gotravelly.com/blog/wp-content/uploads/2018/06/jjajangmyeon.jpg");
        infoMakanan.add("Jjajangmyeon adalah jenis Masakan Korea yaitu mi saus pasta kacang kedelai hitam. Jajang artinya saus goreng, dan myeon artinya mi.");
        hargaMakanan.add("45000");

        namaMakanan.add("Kimbab");
        fotoMakanan.add("https://www.gotravelly.com/blog/wp-content/uploads/2018/06/kimbab.jpg");
        infoMakanan.add("Gimbap adalah jenis makanan Korea yang terdiri dari nasi yang dibungkus dengan rumput laut.");
        hargaMakanan.add("50000");

        namaMakanan.add("Bibimbap");
        fotoMakanan.add("https://www.gotravelly.com/blog/wp-content/uploads/2018/06/bibimbap.jpg");
        infoMakanan.add("Bibimbap adalah masakan Korea berupa semangkuk nasi putih dengan lauk di atasnya berupa sayur-sayuran, daging sapi, telur, dan saus pedas gochujang. Namanya secara harafiah berarti \"nasi campur\" yang berasal dari kata 비빔 dan 밥. Sebelum dimakan, nasi dan lauk diaduk menjadi satu.");
        hargaMakanan.add("56900");

        namaMakanan.add("Bulgogi");
        fotoMakanan.add("https://www.gotravelly.com/blog/wp-content/uploads/2018/06/bulgogi.jpg");
        infoMakanan.add("Bulgogi adalah olahan daging asal Korea. Daging yang digunakan antara lain daging sirloin atau bagian daging sapi pilihan. Bumbu bulgogi adalah campuran kecap asin dan gula ditambah rempah lain bergantung pada resep dan daerah di Korea.");
        hargaMakanan.add("240000");

        namaMakanan.add("Ramyeon");
        fotoMakanan.add("https://www.gotravelly.com/blog/wp-content/uploads/2018/06/ramyeon.jpg");
        infoMakanan.add("Ramyeon atau Ramyun adalah hidangan mi kuah ala Korea. Mi ramyeon dapat dibuat dari mi basah atau mi instan, beberapa merek ramyeon instan selain dikonsumsi di Korea Selatan, ada juga yang diekspor ke luar negeri, seperti ke Tiongkok, Hong Kong, Makau, Jepang, dan Indonesia.");
        hargaMakanan.add("70000");

        namaMakanan.add("Tteokbokki");
        fotoMakanan.add("https://www.gotravelly.com/blog/wp-content/uploads/2018/06/tteokbokki.jpg");
        infoMakanan.add("Tteokbokki adalah makanan Korea berupa tteok dari tepung beras yang dimasak dalam bumbu gochujang yang pedas dan manis. Tteok yang dipakai berbentuk batang yang memanjang. Makanan ini juga termasuk dalam makanan internasional.");
        hargaMakanan.add("35000");

        namaMakanan.add("Samgyetang");
        fotoMakanan.add("https://www.gotravelly.com/blog/wp-content/uploads/2018/06/samgyetang.jpg");
        infoMakanan.add("Samgyetang adalah sup ayam ginseng masakan Korea. Sup ini berisi ayam muda dalam keadaan utuh yang direbus dengan api kecil selama 2-3 jam hingga empuk. Seporsi sup dalam panci kecil biasanya dimakan oleh satu orang. Samgyetang dimakan dengan tambahan merica, garam, dan kimchi yang disediakan di atas meja.");
        hargaMakanan.add("200000");

        namaMakanan.add("Budae Jjigae");
        fotoMakanan.add("https://www.gotravelly.com/blog/wp-content/uploads/2018/06/budae-jjigae.jpg");
        infoMakanan.add("Budae jjigae adalah masakan Korea yang dibuat dari sup yang dimasak dengan ham dan daging kalengan. Masakan ini bermula pada saat berakhirnya Perang Korea ketika rakyat kekurangan bahan pangan.");
        hargaMakanan.add("187000");

        namaMakanan.add("Mandu");
        fotoMakanan.add("https://www.gotravelly.com/blog/wp-content/uploads/2018/06/mandu.jpg");
        infoMakanan.add("Mandu adalah jenis pangsit yang dibuat dengan adonan tepung dan berisi daging yang dibumbui. Mandu adalah jenis masakan yang berasal dari Cina dan masuk ke Korea sejak zaman Dinasti Goryeo.");
        hargaMakanan.add("43000");

        namaMakanan.add("Hotteok");
        fotoMakanan.add("https://www.gotravelly.com/blog/wp-content/uploads/2018/06/hotteok.jpg");
        infoMakanan.add("Hotteok adalah pancake berisi pasta kacang, dijual sebagai makanan jajanan Korea Selatan. Kue ini digoreng dengan minyak yang cukup banyak, enak dimakan sewaktu masih hangat sehingga populer sebagai kudapan sewaktu musim dingin. ");
        hargaMakanan.add("45000");


        prosesRecyclerViewAdapter();
    }
}