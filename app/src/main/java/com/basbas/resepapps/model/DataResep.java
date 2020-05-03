package com.basbas.resepapps.model;

import java.util.ArrayList;

public class DataResep {

    private static String[] namaResep = {
            "Resep Lontong Ayam",
            "Resep Bubur Ayam",
            "Resep Kuah Ayam",
            "Resep Mie Ayam",

    };

    private static String[] gambarResep = {
            "https://doyanresep.com/wp-content/uploads/2020/01/resep-bubur-ayam-628x275.jpg",
            "https://www.masakapahariini.com/wp-content/uploads/2019/01/bubur-ayam-kuning-780x440.jpg",
            "https://www.masakapahariini.com/wp-content/uploads/2019/01/bubur-ayam-kuning-780x440.jpg",
            "https://img-global.cpcdn.com/recipes/1f715502d9d58bab/751x532cq70/opor-ayam-lontong-yummy%F0%9F%98%99-foto-resep-utama.jpg",

    };

    private static String[] detailResep = {
            " Bahan-bahan\n" +
                    "\n" +
                    "    300 g Ayam bagian dada,direbus dan ambil air kaldunya\n" +
                    "    bahan bubur:\n" +
                    "    1 1/2 Cup beras cuci bersih tiriskan\n" +
                    "    10 cup air kaldu (pakai cup takaran beras)\n" +
                    "    2 sendok makan santan kara\n" +
                    "    3 lembar Daun salam\n" +
                    "    secukupnya Garam\n" +
                    "    (campur semua bahan bubur,masak dalam magicom)\n" +
                    "    bahan kuah bubur ayam:\n" +
                    "    1000 ml air rebusan ayam\n" +
                    "    Sisa santan kara\n" +
                    "    Daun salam\n" +
                    "    Kaldu bubuk (optional)\n" +
                    "    Bumbu halus:\n" +
                    "    Bawang merah\n" +
                    "    Bawang putih\n" +
                    "    Kemiri Sereh\n" +
                    "    Ketumbar\n" +
                    "    Kunyit\n" +
                    "    pelengkap\n" +
                    "    Daun bawang *Seledri *Bawang goreng *Cakwe *Krupuk,sambel,kecap ",



            "Resep Bubur Ayam",
            "Resep Kuah Ayam",
            "Resep Mie Ayam",

    };

    public static ArrayList<ModelResep> getListResep() {
        ArrayList<ModelResep> list = new ArrayList<>();
        for (int position = 0; position < namaResep.length; position++) {
            ModelResep modelResep = new ModelResep();
            modelResep.setNamaResep(namaResep[position]);
            modelResep.setDetailResep(detailResep[position]);
            modelResep.setGambarResep(gambarResep[position]);
            list.add(modelResep);
        }
        return list;

    }


}
