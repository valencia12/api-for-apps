package com.example.stefaniniApps.service.impl;

import com.example.stefaniniApps.persistence.entity.Catalogo;
import com.example.stefaniniApps.persistence.repository.CatalogoRepository;
import com.example.stefaniniApps.service.ICatalogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CatalogoService implements ICatalogoService {

    @Autowired
    CatalogoRepository catalogoRepository;

    @Override
    public List<Catalogo> getAllCatalogo() {
        return catalogoRepository.findAll();
    }

    @Override
    public List<Catalogo> getAllCatalogoByCategory(String category) {
        return catalogoRepository.findAllByCategory(category);
    }

    @Override
    public Catalogo getCatalogoById(String id) {
        return catalogoRepository.findByCharacter(id);
    }

    @Override
    public void createCatalogoFromScratch() {
        /**
         * String description, String category, String price, String url, Integer numberRating
         */

        catalogoRepository.save(new Catalogo("1",
        "Plantas vs Zombies",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ",
        "Education",
        20.00,
        "https://firebasestorage.googleapis.com/v0/b/links-ce8df.appspot.com/o/apps%2F1.webp?alt=media&token=c6a4459e-78a3-4cbd-a59e-207e233247cb",
        2,
        "https://firebasestorage.googleapis.com/v0/b/links-ce8df.appspot.com/o/banner%2F1.webp?alt=media&token=8463b9af-9548-402d-9848-53b8a63c0ef7",
        true
        ));

catalogoRepository.save(new Catalogo("2",
"Clash Royale",
"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ",
"Education",
5.00,
"https://firebasestorage.googleapis.com/v0/b/links-ce8df.appspot.com/o/apps%2F2.webp?alt=media&token=437bcc03-4b2c-42f9-aadd-6f907fbe78a0",
5,
"",
true
));

catalogoRepository.save(new Catalogo("3",
"Brawl Stars",
"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ",
"Education",
0.45,
"https://firebasestorage.googleapis.com/v0/b/links-ce8df.appspot.com/o/apps%2F3.webp?alt=media&token=fe788095-8371-4904-8b16-55e44a29e8d9",
5,
"",
true
));
catalogoRepository.save(new Catalogo("4",
        "Plantas vs Zombies",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ",
        "Education",
        20.00,
        "https://firebasestorage.googleapis.com/v0/b/links-ce8df.appspot.com/o/apps%2F4.webp?alt=media&token=ce50a06e-d9f5-4c22-a7b5-0ba9a5d95a8f",
        2,
        "https://firebasestorage.googleapis.com/v0/b/links-ce8df.appspot.com/o/banner%2F1.webp?alt=media&token=8463b9af-9548-402d-9848-53b8a63c0ef7",
        true
        ));

catalogoRepository.save(new Catalogo("5",
"Clash Royale",
"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ",
"Education",
5.00,
"https://firebasestorage.googleapis.com/v0/b/links-ce8df.appspot.com/o/apps%2F5.webp?alt=media&token=8be7ab24-c724-4deb-8e93-8f2514dd295c",
5,
"",
true
));

catalogoRepository.save(new Catalogo("6",
"Brawl Stars",
"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ",
"Education",
0.40,
"https://firebasestorage.googleapis.com/v0/b/links-ce8df.appspot.com/o/apps%2F6.webp?alt=media&token=554a179b-0fbf-4b3d-9a59-669faa1964a8",
5,
"",
true
));catalogoRepository.save(new Catalogo("7",
"Plantas vs Zombies",
"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ",
"Education",
20.00,
"https://firebasestorage.googleapis.com/v0/b/links-ce8df.appspot.com/o/apps%2F7.webp?alt=media&token=f8485e84-bc91-470d-91a1-f2ef75a12b63",
2,
"https://firebasestorage.googleapis.com/v0/b/links-ce8df.appspot.com/o/banner%2F1.webp?alt=media&token=8463b9af-9548-402d-9848-53b8a63c0ef7",
false
));

catalogoRepository.save(new Catalogo("8",
"Clash Royale",
"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ",
"Education",
0.45,
"https://firebasestorage.googleapis.com/v0/b/links-ce8df.appspot.com/o/apps%2F8.webp?alt=media&token=f2807768-aa32-41bd-a466-ec50d04ddcca",
5,
"",
false
));

catalogoRepository.save(new Catalogo("9",
"Brawl Stars",
"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ",
"Education",
5.00,
"https://firebasestorage.googleapis.com/v0/b/links-ce8df.appspot.com/o/apps%2F9.webp?alt=media&token=c32dee5e-c60f-41bf-9ba5-b9d20a6144eb",
5,
"",false
));catalogoRepository.save(new Catalogo("10",
"Plantas vs Zombies",
"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ",
"Education",
20.00,
"https://firebasestorage.googleapis.com/v0/b/links-ce8df.appspot.com/o/apps%2F10.webp?alt=media&token=328fff40-b886-4f39-ae06-256ca23f1365",
2,
"https://firebasestorage.googleapis.com/v0/b/links-ce8df.appspot.com/o/banner%2F1.webp?alt=media&token=8463b9af-9548-402d-9848-53b8a63c0ef7",false
));

catalogoRepository.save(new Catalogo("11",
"Clash Royale",
"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ",
"Education",
5.00,
"https://firebasestorage.googleapis.com/v0/b/links-ce8df.appspot.com/o/apps%2F12.webp?alt=media&token=b3559ce2-14cf-4ccf-a01c-897c684520e9",
5,
"",false
));

catalogoRepository.save(new Catalogo("12",
"Brawl Stars",
"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ",
"Gamer",
5.00,
"https://firebasestorage.googleapis.com/v0/b/links-ce8df.appspot.com/o/apps%2F3.webp?alt=media&token=fe788095-8371-4904-8b16-55e44a29e8d9",
5,
"",false
));catalogoRepository.save(new Catalogo("13",
"Plantas vs Zombies",
"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ",
"Gamer",
20.00,
"https://firebasestorage.googleapis.com/v0/b/links-ce8df.appspot.com/o/apps%2F11.webp?alt=media&token=55eda33b-715b-42be-a4b2-07ff16cf1994",
2,
"https://firebasestorage.googleapis.com/v0/b/links-ce8df.appspot.com/o/banner%2F1.webp?alt=media&token=8463b9af-9548-402d-9848-53b8a63c0ef7",false
));

catalogoRepository.save(new Catalogo("14",
"Clash Royale",
"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ",
"Gamer",
5.00,
"https://firebasestorage.googleapis.com/v0/b/links-ce8df.appspot.com/o/apps%2F2.webp?alt=media&token=437bcc03-4b2c-42f9-aadd-6f907fbe78a0",
5,
""
,false
));

catalogoRepository.save(new Catalogo("15",
"Brawl Stars",
"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ",
"Gamer",
5.00,
"https://firebasestorage.googleapis.com/v0/b/links-ce8df.appspot.com/o/apps%2F3.webp?alt=media&token=fe788095-8371-4904-8b16-55e44a29e8d9",
5,
"",false
));
catalogoRepository.save(new Catalogo("16",
"Plantas vs Zombies",
"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ",
"Gamer",
20.00,
"https://firebasestorage.googleapis.com/v0/b/links-ce8df.appspot.com/o/apps%2F16.webp?alt=media&token=1938f7fc-718a-4208-a193-5365ebae33c4",
2,
"https://firebasestorage.googleapis.com/v0/b/links-ce8df.appspot.com/o/banner%2F1.webp?alt=media&token=8463b9af-9548-402d-9848-53b8a63c0ef7",false
));

catalogoRepository.save(new Catalogo("17",
"Clash Royale",
"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ",
"Gamer",
5.00,
"https://firebasestorage.googleapis.com/v0/b/links-ce8df.appspot.com/o/apps%2F17.webp?alt=media&token=57677cc7-d344-4499-adad-01fe464db776",
5,
"",false
));

catalogoRepository.save(new Catalogo("18",
"Brawl Stars",
"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ",
"Gamer",
5.00,
"https://firebasestorage.googleapis.com/v0/b/links-ce8df.appspot.com/o/apps%2F3.webp?alt=media&token=fe788095-8371-4904-8b16-55e44a29e8d9",
5,
"",false
));catalogoRepository.save(new Catalogo("19",
"Plantas vs Zombies",
"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ",
"Education",
20.00,
"https://firebasestorage.googleapis.com/v0/b/links-ce8df.appspot.com/o/apps%2F19.webp?alt=media&token=bad53262-c9fa-42ae-8ecd-28389d105880",
2,
"https://firebasestorage.googleapis.com/v0/b/links-ce8df.appspot.com/o/banner%2F1.webp?alt=media&token=8463b9af-9548-402d-9848-53b8a63c0ef7",false
));

catalogoRepository.save(new Catalogo("20",
"Clash Royale",
"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ",
"Infante",
5.00,
"https://firebasestorage.googleapis.com/v0/b/links-ce8df.appspot.com/o/apps%2F20.webp?alt=media&token=708b6c84-0ffb-4fca-bdf8-8034528351af",
5,
"",false
));

catalogoRepository.save(new Catalogo("21",
"Brawl Stars",
"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ",
"Infante",
5.00,
"https://firebasestorage.googleapis.com/v0/b/links-ce8df.appspot.com/o/apps%2F21.webp?alt=media&token=d89f19ed-93af-4e42-96a8-d4d9a63f3994",
5,
"",false
));catalogoRepository.save(new Catalogo("22",
"Plantas vs Zombies",
"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ",
"Education",
20.00,
"https://firebasestorage.googleapis.com/v0/b/links-ce8df.appspot.com/o/apps%2F22.webp?alt=media&token=a0821f5d-4935-45c4-803f-57f978216b69",
2,
"https://firebasestorage.googleapis.com/v0/b/links-ce8df.appspot.com/o/banner%2F1.webp?alt=media&token=8463b9af-9548-402d-9848-53b8a63c0ef7",false
));

catalogoRepository.save(new Catalogo("23",
"Clash Royale",
"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ",
"Education",
5.00,
"https://firebasestorage.googleapis.com/v0/b/links-ce8df.appspot.com/o/apps%2F2.webp?alt=media&token=437bcc03-4b2c-42f9-aadd-6f907fbe78a0",
5,
"",false
));

catalogoRepository.save(new Catalogo("24",
"Brawl Stars",
"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ",
"Education",
5.00,
"https://firebasestorage.googleapis.com/v0/b/links-ce8df.appspot.com/o/apps%2F23.webp?alt=media&token=d77df7ab-2b85-4501-b3c7-f5b1d16f6f60",
5,
"",false
));catalogoRepository.save(new Catalogo("25",
"Plantas vs Zombies",
"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ",
"Education",
20.00,
"https://firebasestorage.googleapis.com/v0/b/links-ce8df.appspot.com/o/apps%2F25.webp?alt=media&token=7e4acc34-e6e5-4d3c-bf1b-4a4d7e88c520",
2,
"https://firebasestorage.googleapis.com/v0/b/links-ce8df.appspot.com/o/banner%2F1.webp?alt=media&token=8463b9af-9548-402d-9848-53b8a63c0ef7",false
));

catalogoRepository.save(new Catalogo("26",
"Clash Royale",
"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ",
"Education",
5.00,
"https://firebasestorage.googleapis.com/v0/b/links-ce8df.appspot.com/o/apps%2F26.webp?alt=media&token=27c8a16b-8b68-4954-a071-a760825b99ed",
5,
"",false
));

catalogoRepository.save(new Catalogo("27",
"Brawl Stars",
"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ",
"Education",
5.00,
"https://firebasestorage.googleapis.com/v0/b/links-ce8df.appspot.com/o/apps%2F27.webp?alt=media&token=3239e6e4-59ff-4d58-a9ad-a7383ce2741f",
5,
"",false
));catalogoRepository.save(new Catalogo("28",
"Plantas vs Zombies",
"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ",
"Education",
20.00,
"https://firebasestorage.googleapis.com/v0/b/links-ce8df.appspot.com/o/apps%2F27.webp?alt=media&token=3239e6e4-59ff-4d58-a9ad-a7383ce2741f",
2,
"https://firebasestorage.googleapis.com/v0/b/links-ce8df.appspot.com/o/banner%2F1.webp?alt=media&token=8463b9af-9548-402d-9848-53b8a63c0ef7",false
));

catalogoRepository.save(new Catalogo("29",
"Clash Royale",
"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ",
"Education",
5.00,
"https://firebasestorage.googleapis.com/v0/b/links-ce8df.appspot.com/o/apps%2F29.webp?alt=media&token=03b2fd60-5965-4a64-a1df-e89051d401ed",
5,
"",false
));

catalogoRepository.save(new Catalogo("30",
"Brawl Stars",
"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ",
"Education",
5.00,
"https://firebasestorage.googleapis.com/v0/b/links-ce8df.appspot.com/o/apps%2F30.webp?alt=media&token=8fe7740a-2865-4649-909c-102ab65e5cba",
5,
"",false
));catalogoRepository.save(new Catalogo("31",
"Plantas vs Zombies",
"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ",
"Education",
20.00,
"https://firebasestorage.googleapis.com/v0/b/links-ce8df.appspot.com/o/apps%2F31.webp?alt=media&token=a90de745-62e3-45cc-826c-a8168bc811a9",
2,
"https://firebasestorage.googleapis.com/v0/b/links-ce8df.appspot.com/o/banner%2F1.webp?alt=media&token=8463b9af-9548-402d-9848-53b8a63c0ef7",false
));

catalogoRepository.save(new Catalogo("32",
"Clash Royale",
"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ",
"Education",
5.00,
"https://firebasestorage.googleapis.com/v0/b/links-ce8df.appspot.com/o/apps%2F2.webp?alt=media&token=437bcc03-4b2c-42f9-aadd-6f907fbe78a0",
5,
"",false
));

catalogoRepository.save(new Catalogo("33",
"Brawl Stars",
"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ",
"Education",
5.00,
"https://firebasestorage.googleapis.com/v0/b/links-ce8df.appspot.com/o/apps%2F32.webp?alt=media&token=0a817cb6-bd31-433b-936f-3a0c1dc2c3a4",
5,
"",false
));catalogoRepository.save(new Catalogo("34",
"Plantas vs Zombies",
"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ",
"Education",
20.00,
"https://firebasestorage.googleapis.com/v0/b/links-ce8df.appspot.com/o/apps%2F1.webp?alt=media&token=c6a4459e-78a3-4cbd-a59e-207e233247cb",
2,
"https://firebasestorage.googleapis.com/v0/b/links-ce8df.appspot.com/o/banner%2F1.webp?alt=media&token=8463b9af-9548-402d-9848-53b8a63c0ef7",false
));

catalogoRepository.save(new Catalogo("35",
"Clash Royale",
"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ",
"Education",
5.00,
"https://firebasestorage.googleapis.com/v0/b/links-ce8df.appspot.com/o/apps%2F34.webp?alt=media&token=6b363d65-9bf4-4a79-ad32-3ba6d8d14eab",
5,
""
,false
));

catalogoRepository.save(new Catalogo("36",
"Brawl Stars",
"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ",
"Education",
5.00,
"https://firebasestorage.googleapis.com/v0/b/links-ce8df.appspot.com/o/apps%2F36.webp?alt=media&token=768c70ce-2b96-4c91-8f3e-4d43e36afcb3",
5,
"",false
));catalogoRepository.save(new Catalogo("37",
"Plantas vs Zombies",
"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ",
"Education",
20.00,
"https://firebasestorage.googleapis.com/v0/b/links-ce8df.appspot.com/o/apps%2F37.webp?alt=media&token=b25bbe8e-a7d6-4ae3-b29a-ca07b0d178db",
2,
"https://firebasestorage.googleapis.com/v0/b/links-ce8df.appspot.com/o/banner%2F1.webp?alt=media&token=8463b9af-9548-402d-9848-53b8a63c0ef7",false
));

catalogoRepository.save(new Catalogo("38",
"Clash Royale",
"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ",
"Education",
5.00,
"https://firebasestorage.googleapis.com/v0/b/links-ce8df.appspot.com/o/apps%2F38.webp?alt=media&token=7116198e-c8f2-4b2c-941d-487b3fbcaba6",
5,
"",false
));

catalogoRepository.save(new Catalogo("39",
"Brawl Stars",
"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ",
"Education",
5.00,
"https://firebasestorage.googleapis.com/v0/b/links-ce8df.appspot.com/o/apps%2F41.webp?alt=media&token=0dd2e44d-842a-404b-98c0-cafbf8e4c127",
5,
"",false
));catalogoRepository.save(new Catalogo("40",
"Plantas vs Zombies",
"Esto es una descripcion, de prueba numero 1",
"Education",
20.00,
"https://firebasestorage.googleapis.com/v0/b/links-ce8df.appspot.com/o/apps%2F1.webp?alt=media&token=c6a4459e-78a3-4cbd-a59e-207e233247cb",
2,
"https://firebasestorage.googleapis.com/v0/b/links-ce8df.appspot.com/o/banner%2F1.webp?alt=media&token=8463b9af-9548-402d-9848-53b8a63c0ef7",false
));

catalogoRepository.save(new Catalogo("41",
"Clash Royale",
"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ",
"Education",
5.00,
"https://firebasestorage.googleapis.com/v0/b/links-ce8df.appspot.com/o/apps%2F41.webp?alt=media&token=0dd2e44d-842a-404b-98c0-cafbf8e4c127",
5,
"",false
));

catalogoRepository.save(new Catalogo("42",
"Brawl Stars",
"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ",
"Education",
5.00,
"https://firebasestorage.googleapis.com/v0/b/links-ce8df.appspot.com/o/apps%2F42.webp?alt=media&token=1a6f52f5-5642-448b-9c44-341835751daa",
5,
"",false
));
catalogoRepository.save(new Catalogo("43",
"Brawl Stars",
"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ",
"Education",
5.00,
"https://firebasestorage.googleapis.com/v0/b/links-ce8df.appspot.com/o/apps%2F43.webp?alt=media&token=a5adb95a-8cc2-425f-b089-2d270bf6782e",
5,
"",false
));
catalogoRepository.save(new Catalogo("44",
"Brawl Stars",
"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ",
"Education",
5.00,
"https://firebasestorage.googleapis.com/v0/b/links-ce8df.appspot.com/o/apps%2F44.webp?alt=media&token=553e1747-8244-4e59-9b86-97480a5a893c",
5,
"",false
));
catalogoRepository.save(new Catalogo("45",
"Brawl Stars",
"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ",
"Education",
5.00,
"https://firebasestorage.googleapis.com/v0/b/links-ce8df.appspot.com/o/apps%2F45.webp?alt=media&token=ab00ca53-3f49-4c13-8a9c-6f0590878dd0",
5,
"",false
));
catalogoRepository.save(new Catalogo("46",
"Brawl Stars",
"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ",
"Education",
5.00,
"https://firebasestorage.googleapis.com/v0/b/links-ce8df.appspot.com/o/apps%2F46.webp?alt=media&token=3079f403-0d75-46f5-a25f-8a2f3f6cea4d",
5,
"",false
));
catalogoRepository.save(new Catalogo("47",
"Brawl Stars",
"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ",
"Education",
5.00,
"https://firebasestorage.googleapis.com/v0/b/links-ce8df.appspot.com/o/apps%2F47.webp?alt=media&token=9331e6ac-8438-4f20-b7b7-4a9b90be2e40",
5,
"",false
));
catalogoRepository.save(new Catalogo("48",
"Brawl Stars",
"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ",
"Education",
5.00,
"https://firebasestorage.googleapis.com/v0/b/links-ce8df.appspot.com/o/apps%2F48.webp?alt=media&token=1c4657cb-dd3c-4856-88d0-24c358ffb0cc",
5,
"",false
));
catalogoRepository.save(new Catalogo("49",
"Brawl Stars",
"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ",
"Education",
5.00,
"https://firebasestorage.googleapis.com/v0/b/links-ce8df.appspot.com/o/apps%2F49.webp?alt=media&token=7c598012-e1a0-4ec2-9238-54ef40dd9011",
5,
"",false
));
    }

}
