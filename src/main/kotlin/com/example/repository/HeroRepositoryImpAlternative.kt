package com.example.repository

import com.example.models.ApiResponse
import com.example.models.Hero

class HeroRepositoryImpAlternative:HeroRepositoryAlternative {

    override val heroes = listOf(
        Hero(
            id = 1,
            name = "BTS",
            image = "/images/bTS.jpg",
            about = "BTS, diğer adıyla Bangtan Boys (방탄소년단), Hybe Corporation tarafından oluşturulan, 7 üyeden oluşan Güney Koreli grup. Grubun hayranlarına \"ARMY\" denmektedir. Jin, Suga, J-Hope, RM, Jimin, V ve Jungkook'dan oluşan yedili, albümlerinin çoğunu birlikte yazar ve birlikte üretir. Başlangıçta bir hip hop grubu olan müzikal tarzları, çok çeşitli türleri içerecek şekilde gelişti. Genellikle kişisel ve sosyal sorunlara odaklanan şarkı sözleri, ruh sağlığı, okul çağındaki gençliğin sorunları ve yaşlanma, kayıp, kendini sevme yolculuğu ve bireysellik temalarına değiniyor. Çalışmaları ayrıca genellikle edebiyat ve psikolojik kavramlara atıfta bulunur ve alternatif bir evren hikayesi içerir.",
            rating = 5.0,
            power = 99,
            month = "Mayıs",
            day = "2013",
            family = listOf(
                "Jin",
                "Suga",
                "J-Hope",
                "RM",
                "Jimin",
                "V",
                "Jungkook"
            ),
            abilities = listOf(
                "Butter",
                "My Universe",
                "Dynamite",
                "Permissions to Dance",
                "Boy With Luv",
                "On"
            ),
            natureTypes = listOf(
                "K-Pop",
                "Hip hop",
                "Pop",
                "R&B",
                "EDM"
            )
        ),
        Hero(
            id = 2,
            name = "EXO",
            image = "/images/exo.jpg",
            about = "4 üyesi Çin,8 üyesi Güney Kore,olan 12 kişilik Koreli erkek grubudur.Ayrıca Korece ağırlıklı şarkı söylenen Exo-Kve Mandarince ağırlıklı şarkı söylenen Exo-Molmak üzere 2alt grubu vardır.EXO,S.M Entertainment tarafından kurulan Koreli-Çinli karışık 12 kişiden oluşan müzik grubudur.2011 yılında Seoul'da kurulmuştur.EXO,toplamda 12 kişi olup ikişer grup halinde ayrılmışlardır.EXO-Kve EXO-M,performanslarını Çince ve Korece olarak sergilemektedirler.İsimleri Güneş sisteminin dışında olan EXO Planet'ten gelmektedir.EXO,80 kategoride aday gösterilip toplamda 42 ödül kazandı.",
            rating = 4.8,
            power = 98,
            month = "Nisan",
            day = "2011",
            family = listOf(
                "Xiumin",
                "Suho",
                "Lay",
                "Baekhyun",
                "Chen",
                "Chanyeol",
                "D.O.",
                "Kai",
                "Sehun"
            ),
            abilities = listOf(
                "Overdose",
                "Growl",
                "Call Me Bayb",
                "Wolf",
                "History",
                "Love Me Right",
                "Mama"
            ),
            natureTypes = listOf(
                "K-Pop",
                "Hip hop",
                "Electironik",
                "R&B",
                "Dans-pop",

            )
        ),
        Hero(
            id = 3,
            name = "Blackpink",
            image = "/images/blackpink.jpg",
            about = "Blackpink 블랙핑크,stilize yazılışı BLACKPINK ve BLΛƆKPIИK),2016 yılında YG Entertainment tarafından kurulmuş Güney Koreli kız grubudur.İsimleri neden 'Blackpink'? Grubun adı, genel olarak kadınlık algısı yaratan pembe renge karşılık gelen siyahın birleşiminden oluşuyor.YG Entertainment etiketiyle ilk çıktıklarında, bu isimle 'güzellikten daha fazlasını' temsil etmek istediklerini söylediler.Billboard Dünya Dijital Şarkı Satışları listesine üç kez giren ilk Koreli kız grubuydular. ",
            rating = 4.7,
            power = 98,
            month = " ",
            day = "2016",
            family = listOf(
                "Jisoo",
                "Jennie",
                "Rosé",
                "Lisa"
            ),
            abilities = listOf(
                "'Ddu-Du Ddu-Du",
                "Whistle",
                "Boombayah",
                "Kiss and Make Up",
                "Square Up",
            ),
            natureTypes = listOf(
                "K-pop",
                "EDM",
                "Hip hop",
                "trap"
            )
        ),
        Hero(
            id = 4,
            name = "TXT",
            image = "/images/txt.jpg",
            about = "TXT,Tomorrow X Together'ın kısaltmasıdır. Korece'de grubun adı 투모로우바이투게더 (RR: Tumoroubaitugedeo) olarak okunuyor ve Türkçe'de Yarın Birlikteolarak çevriliyor. Adlarının ayrı bir Korece versiyonu yoktur. Web sitelerine göre,Yarın Birlikte nin anlamı Daha iyi bir yarın inşa etme umuduyla tek bir hayal altında bir araya gelen beş kişi demek. TXT,bugüne kadar,çıkış yapması en çok beklenen idol gruplarından biri olmalı.Onlar,2013 yılında debut yapan BTS'ten sonra,Big Hit Entertainment'in ilk erkek grubu ve BTS'in\"küçük kardeşleri\"olduğu için,tanıtıldıkları ilk andan itibaren dünya çapında milyonlarca insanın ilgisini çektiler.",
            rating = 4.6,
            power = 94,
            month = "Mart",
            day = "2019",
            family = listOf(
                "Soobin",
                "Yeonjun",
                "Prodgyu",
                "Taehyun",
                "Huening Kai"
            ),

            abilities = listOf(
                "Good Boy Gone Bad",
                "PS5",
                "Opening Sequence",
                "LOSER=LO♡ER",
                "Cat & Dog",
                "Frost",
                "Anti-Romantic"

            ),
            natureTypes = listOf(
                "K-pop",
                "Hip hop",
            )
        ),

        Hero(
            id = 5,
            name = "GOT7",
            image = "/images/got7.jpg",
            about = "GOT7, Güney Koreli bir K-pop grubudur.Çok uluslu olan grupta Güney Kore, Amerika, Hong Kong ve Taylandlı üyeler vardır. İki üyesi, JB ve Jinyoung, 2012 yılında JJ Project olarak çıkış yaptılar. Grubun \"Dream Knight\" isimli bir mini dizisi vardır.Grubun şarkılarında ve performanslarında çok ''tricking'' bulunduğu için üst düzey grup GOT7 sahne performanslarıyla dikkat çekti. 20 Ocak 2014'te grubun ilk albümleri olan \"Got it\" yayınlandı.",
            rating = 4.4,
            power = 90,
            month = "Ocak",
            day = "2014",
            family = listOf(
                "Mark",
                "JB",
                "Jackson",
                "Jin-young",
                "Youngjae",
                "BamBam",
                "Yugyeom"
            ),
            abilities = listOf(
                "You Calling My Name",
                "Just right",
                "NOT BY THE MOON",
                "NANANA",
                "하드 캐리 Hard Carry",
                "Two",
                "TRUTH"
            ),
            natureTypes = listOf(
                "K-pop"
            )
        ),
        Hero(
            id = 6,
            name = "iKon",
            image = "/images/ikon.jpeg",
            about = "iKON (Kore: 아이콘), YG Entertainment tarafından kurulan ve 15 Eylül 2015 yılında çıkış yapan Güney Koreli bir erkek grubudur.Grup ilk kez “WIN: Who is Next” isimli TV programında Takım B olarak tanıtıldı. Daha sonra 2014’te “Mix&Match” isimli programda son yedi üye belirlendi ve grubun üyeleri böylece kesinleşmiş oldu. Grubun ismi  ingilizce “Icon” kelimesinden türetilmiştir. “C” yerine “K” harfi kullanılarak K-Pop kültürüne gönderme yapılıyor. Hayranlarına \"iKONIC\" denilmektedir. ",
            rating = 4.2,
            power = 92,
            month = "Eylül ",
            day = "2015",
            family = listOf(
              "Song",
                "Jay",
                "Bobby",
                "June",
                "DK",
                "Chan"
            ),
            abilities = listOf(
                "LOVE SCENARIO",
                "BUT YOU",
                "Strength",
                "KILLING ME",
                "BEST FRIEND",
                "Why Why Why",
            ),
            natureTypes = listOf(
                "R&B",
                "K-pop",
                "Hip hop"
            )
        ),
        Hero(
            id = 7,
            name = "TWICE",
            image = "/images/twice.jpg",
            about = "Sixteen isimli reality programı aracılığıyla JYP Entertainment tarafından oluşturulan dokuz üyeli K-Pop kız grubudur.Twice, 2016'da yayınlamış olduğu \"Cheer Up\" single'ı ile üne kavuştu. Şarkı Gaon Digital Chart (가온 디지털 차트)'ta birinci oldu ve \"Yılın En İyi Single\"ı ünvanına sahip oldu. Bu şarkı aynı zamanda Melon Music Awards ve Mnet Asian Music Awards'ta \"Yılın En İyi Şarkısı\" ödüllerini de kazandı.",
            rating = 5.0,
            power = 98,
            month = "Ekim",
            day = "2015",
            family = listOf(
                "Nayeon",
                "Tzuyu",
                "Momo",
                "Sana",
                "Jihyo",
                "Mina",
                "Dahyun",
                "Jeongyeon",
                "Chaeyoung"
            ),
            abilities = listOf(
                "The Feels",
                "FANCY",
                "What is Love",
                "SCIENTIST",
                "CHEER UP",
                "LIKEY",
                "SIGNAL",
                "ICAN'T STOP ME",
            ),
            natureTypes = listOf(
                "K-pop",
                "J-pop",
                "dans-pop",
                "EDM",
                "bubblegum pop"
            )
        ),
        Hero(
            id = 8,
            name = "ENHYPEN",
            image = "/images/ENHYPEN.jpg",
            about = "ENHYPEN 7 üyeden oluşan Güney Koreli Kpop grubudur. Grup Bighit Entertainment ve CJ Entertainment'in yapımını üstlendiği I-Land yarışmasının kazananlarından oluşturulmuştur. Grup resmi çıkışını 30 Kasım 2020'de BORDER: Day One albümü Given-Taken şarkısı ile yapmıştır.Grup isminin anlamı: ENHYPEN3 kelimenin  birleşmesiyle oluşturulmuştur.Bunlar Bağ (Bağlantı) Keşif ve Büyüme\"Tek başına parlayan yedi ışık, birbirlerini keşfedip birlikte büyürler, birbirlerinin sınırlarını aşarak birleşik bir bütün oluştururlar.\"",
            rating = 4.5,
            power = 96,
            month = "Kasım",
            day = "2020",
            family = listOf(
                "Yang Jungwon",
                "Lee Heeseung",
                "Jay Park",
                "Jake Shim",
                "Kim Sunoo",
                "Park Sunghoon",
                "Nishimura Riki(Ni-Ki)"
            ),
            abilities = listOf(
                "Polaroid Love",
                "FEVER",
                "Drunk-Dazed",
                "Blessed-Cursed",
                "Drunk-Dazed",
                "Given-Taken",
                "HEY TAYO"
            ),
            natureTypes = listOf(
                "K-pop",
            )
        ),
        Hero(
            id = 9,
            name = "Treasure",
            image = "/images/treasure.jpg",
            about = "Treasure (Hangul:트레저;Japonca:トレジャー; olarak yazılır.),YG Entertainment tarafından hayatta kalma programı olan YG Treasure Box aracılığıyla 2019 yılında kurulan Güney Koreli bir erkek grubudur.Ocak 2020 yılında Treasure, performans videoları \"Going Crazy\" tek dahil haftalık resimsel bültenleri yoluyla kamuoyuna yeniden tanıtıldı Debut öncesinde, Treasure 27 Mayıs'ta Billboard 's Social 50 listesinde 40 numarada yer alan en hızlı K-Pop grubu olarak kaydedildi ve kısa süre sonra 12 numaraya kadar zirveye ulaştı.",
            rating = 4.5,
            power = 89,
            month = " ",
            day = "2019",
            family = listOf(
                "Choi Hyunsuk",
                "Jihoon",
                "Yoshi",
                "Junkyu",
                "Mashiho",
                "Yoon Jaehyuk",
                "Asahi",
                "Bang Yedam",
                "Doyoung",
                "Haruto",
                "Park Jeongwoo",
                "So Junghwan"
            ),
            abilities = listOf(
                "DARARI",
                "JIKJIK",
                "I LOVE YOU",
                "U",
                "GOING CRAZY",
                "BOY"
            ),
            natureTypes = listOf(
                "K-pop",
                "Hip-Hop"
            )
        ),
        Hero(
            id = 10,
            name = "Ateez",
            image = "/images/ateez.jpg",
            about = "Ateez (Korece: 에이티즈, okunuşu: \"Ei-Teez\"), KQ Entertainment tarafından 2018 yılında oluşturulan sekiz üyeli gruptur.Grup ismi olan ATEEZ'in anlamı “A TEEnager Z”dır, aynı zamanda “KQ FELLAZ” olarak da bilinirler. Fanları için kullandıkları ad ''ATINY''dir. Bu kelime ATEEZ ve DESTINY kelimelerinin birleşimidir. ",
            rating = 4.2,
            power = 88,
            month = "Ekim",
            day = "2018",
            family = listOf(
                "Hongjoong",
                "Seonghwa",
                "Yunho",
                "Yeosang",
                "San",
                "Mingi",
                "Wooyoung",
                "Jongho"
            ),
            abilities = listOf(
                "Deja Vu",
                "Fireworks",
                "Answer",
                "WONDERLAND",
                "INCEPTION",
                "Promise",
                "THANXX"
            ),
            natureTypes = listOf(
                "K-pop",
                "J-pop"
            )
        ),
        Hero(
            id = 11,
            name = "IVE",
            image = "/images/tive.jpg",
            about = "Ive (Korece:아이브; IVE olarak stilize edilmiştir) Starship Entertainment tarafından kurulmuş bir Güney Koreli kız grubudur.Grubun adı Ive, \"I have\" için bir kısaltmadır . İzleyiciye \"sahip olduğum\" şeyi güvenle gösterme fikrini ima eder. Büyüyen bir kız grubunun hikayesini anlatmak yerine, baştan \"tam bir kız grubunu\" canlandırmaya çalışır.",
            rating = 4.5,
            power = 89,
            month = " ",
            day = "2021",
            family = listOf(
                "Yujin",
                "Gaeul",
                "Kral",
                "Wonyoung",
                "Liz",
                "Leeseo"
            ),
            abilities = listOf(
                "LOVE DIVE",
                "ELEVEN",
                "ROYEL",
                "Take ıt"
            ),
            natureTypes = listOf(
                "K-pop"
            )
        ),
        Hero(
            id = 12,
            name = "Everglow",
            image = "/images/everglow.jpg",
            about = "Everglow (에버글로우) Yuehua Entertainment tarafından oluşturulan Güney Koreli kız grubu. Bu grup adını İngilizce kökenli ‘Everglow’dan alıyor. ’Yaprak dökmeyen’ anlamına gelen Everglow Grubu’nda altı kişi bulunuyor. Everglow Grubu 2020 yılında Amerika Birleşik Devletleri’nde düzenlenen Everlasting Turu ile daha çok bilinirliliğe ulaştı.",
            rating = 4.2,
            power = 88,
            month = "Mart",
            day = "2019",
            family = listOf(
                "E:U",
                "Sihyeon",
                "Mia",
                "Onda",
                "Aisha",
                "Yiren"
            ),
            abilities = listOf(
                "Pirate",
                "DUN DUN",
                "LA DI DA",
                "FIRST",
                "Adios"
            ),
            natureTypes = listOf(
                "K-pop"
            )
        ),
        Hero(
            id = 13,
            name = "LE SSERAFIM",
            image = "/images/alesserafım.jpg",
            about = "Le Sserafim Source Music ve Hybe Corporation tarafından kurulan Güney Koreli kız grubu.Grubun adı Le Sserafim, \"Ben Korkusuzum\" ifadesinin bir anagramıdır.",
            rating = 4.6,
            power = 91,
            month = "Mayıs",
            day = "2022",
            family = listOf(
                "Sakura",
                "Garam",
                "Eunchae",
                "Chaewon",
                "Kazuha",
                "Yunjin"
            ),
            abilities = listOf(
                "FEARLESS",
                "Blue Flame",
                "Soul Grapes",
                "The Great Mermaid",
            ),
            natureTypes = listOf(
                "K-pop"
            )
        ),
        Hero(
            id = 14,
            name = "(G)I-DLE",
            image = "/images/dle.jpg",
            about = "(G)I-DLE (Korece:(여자)아이들; RR: Yeoja Aideul),stilize olarak (G)I-DLE, 2 Mayıs 2018 tarihinde Cube Entertainment tarafından oluşturulan Güney Koreli kız grubudur.“to be idle” İngilizce’de “boşta olmak, hiçbir şey yapmamak” anlamına gelir. Soyeon bu anlamdan memnun değildi ve kendi anlamını bulmak istedi. Grup arkadaşları da Soyeon’la aynı görüşü savunarak grubun ismini (G)I-DLE olarak değiştirdi.  ",
            rating = 4.7,
            power = 93,
            month = "Mayıs",
            day = "2018",
            family = listOf(
                "Miyeon",
                "Minnie",
                "Soyeon",
                "Yuqi",
                "Shuhua",
            ),
            abilities = listOf(
                "TOMBOY",
                "MY BAG",
                "POP/STARS",
                "MORE",
                "THE BADDEST",
            ),
            natureTypes = listOf(
                "K-pop",
                "hip hop",
                "EDM",
            )
        ),
        Hero(
            id = 15,
            name = "ITZY",
            image = "/images/tzy.jpg",
            about = "Itzy (Korece:있지; stil olarak ITZY) JYP Entertainment tarafından oluşturulan Güney Koreli kız grubudur.Anlamı: ITZY kelimesi Korecede sahip olmak anlamına geliyor. Yani Kızların (üyelerin) sizin sahip olmak istediğiniz bütün güzelliklere sahip olduğu anlamına geliyor.",
            rating = 4.5,
            power = 90,
            month = "Şubat",
            day = "2019",
            family = listOf(
                "Yeji",
                "Ryujin",
                "Lia",
                "Chaeryeong",
                "Yuna"
            ),
            abilities = listOf(
                "LOCO",
                "WANNABE",
                "In the morning",
                "Not Shy",
                "Voltage"
            ),
            natureTypes = listOf(
                "K-pop"
            )

        ),
        Hero(
            id = 16,
            name = "zaraki-kenpachi",
            image = "/images/zaraki-kenpachi.jpg",

            about = "Kendi Haritanızı Oluşturun Kendinize ait haritalar oluşturarak farklı planları hızlandırabilirsiniz. Oluşturacağınız harita ile gideceğiniz lokasyonu tekrar aramanıza gerek kalmadan haritayı tıklamanız yeterli olacaktır. Kendinize özel haritalar oluşturabilmek için uygulamanın sol köşedeki menü düğmesine (üç çizgi), ardından Yerleriniz'e basın. Bu sekmeden Haritalar'a gidin ve alttaki Harita Oluştur'a basın (veya daha önce yapmış olduğunuz bir haritaya tıklayın). Bu araç, özellikle daha önce hiç gitmediğiniz bölgeleri keşfetmenize yarayacak. Herhangi bir gezi ya da tatil planınız varsa haritaya işaret yerleştirebilir ve farklı gruplara ayırabilirsiniz. Böylece zamanınızı en iyi şekilde değerlendirebilirsiniz. Arkadaşlarınızla ya da ailenizle gideceğiniz bir tatile ortak çalışan ekleyerek 'paylaş' seçeneğini kullanabilirsiniz. Bu şekilde harita üzerinde tatil planında her katılımcı ilginç görülen yerleri işaretleyebilir ve herkesin görmesini sağlayabilir.",
            rating = 2.1,
            power = 99,
            month = "Jan",
            day = "1st",
            family = listOf(
                "Ahmet",
                "Mehmet",
                "Ahmet",
                "Mehmet",
                "Ahmet",
                "Mehmet" , "Ahmet",
                "Mehmet",
                "Ahmet",
                "Mehmet",
                "Ahmet",
                "Mehmet"
            ),
            abilities = listOf(
                "White Karma",
                "Transformation",
                "Genjutsu"
            ),
            natureTypes = listOf(
                "Unknown"
            )
        )



    )

    override suspend fun getAllHeroes(page: Int, limit: Int): ApiResponse {
        return ApiResponse(
            success = true,
            message = "ok",
            prevPage = calculatePage(
                heroes = heroes,
                page =page,
                limit= limit
            )["prevPage"],
            nextPage = calculatePage(
                heroes = heroes,
                page = page,
                limit = limit
            )["nextPage"],
            heroes = provideHeroes(
                heroes = heroes,
                page = page,
                limit = limit
            ),
            lastUpdated = System.currentTimeMillis()
        )
    }

    override suspend fun searchHeroes(name: String?): ApiResponse {
        return ApiResponse(
            success = true,
            message = "ok",
            heroes =    findHeroes(query = name )
        )
    }
    private fun calculatePage(
        heroes:List<Hero>,
        page: Int,
        limit: Int
    ): Map<String, Int?>{
        val allHeroes = heroes.windowed(
            size = limit,
            step = limit,
            partialWindows = true
        )
        require(page <= allHeroes.size)
        val prevPage= if (page == 1) null else page - 1
        val nextPage = if (page == allHeroes.size) null else page + 1
        return mapOf(
            "prevPage" to prevPage,
            "nextPage" to nextPage
        )
    }

    private fun provideHeroes(
        heroes: List<Hero>,
        page: Int,
        limit: Int
    ): List<Hero>{
        val allHeroes = heroes.windowed(
            size = limit,
            step = limit,
            partialWindows = true
        )
        require(page > 0 && page <= allHeroes.size)
        return allHeroes[ page - 1]
    }

    private fun findHeroes(query: String?): List<Hero>{
        val founded = mutableListOf<Hero>()
        return if (!query.isNullOrEmpty()) {
                heroes.forEach { hero ->
                    if (hero.name.lowercase().contains(query.lowercase())){
                        founded.add(hero)
                    }
                }

            founded
        }else{
            emptyList()
        }
    }
}