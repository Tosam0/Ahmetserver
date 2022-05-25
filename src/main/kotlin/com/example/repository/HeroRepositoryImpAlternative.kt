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
            name = "Isshiki",
            image = "/images/ishiki.jpg",
            about = "A thousand years ago, Isshiki came to Earth alongside Kaguya with the objective to plant a Tree to harvest its Chakra Fruit. While Kaguya, being lower-ranked, was planned to be sacrificed to create the Chakra Fruit, she instead turned on Isshiki, leaving him on the verge of death after destroying Isshiki's lower half. Encountering Jigen and not having the strength to implant a Kāma on him, Isshiki devised a desperate plan and shrunk himself to enter the monk's ear in order to survive his injury by absorbing Jigen's nutrients.",
            rating = 5.0,
            power = 100,
            month = "Jan",
            day = "1",
            family = listOf(
                "Otsutsuki Clan"
            ),
            abilities = listOf(
                "Sukunahikona",
                "Daikokuten",
                "Byakugan",
                "Space–Time",
                "Intelligence"
            ),
            natureTypes = listOf(
                "Fire"
            )
        ),
        Hero(
            id = 10,
            name = "Momoshiki",
            image = "/images/momoshiki.jpg",
            about = "Momoshiki Ōtsutsuki (大筒木モモシキ, Ōtsutsuki Momoshiki) was a member of the Ōtsutsuki clan's main family, sent to investigate the whereabouts of Kaguya and her God Tree and then attempting to cultivate a new one out of the chakra of the Seventh Hokage. In the process of being killed by Boruto Uzumaki, Momoshiki placed a Kāma on him, allowing his spirit to remain intact through the mark.",
            rating = 3.9,
            power = 98,
            month = "Jan",
            day = "1",
            family = listOf(
                "Otsutsuki Clan"
            ),
            abilities = listOf(
                "Rinnegan",
                "Byakugan",
                "Strength"
            ),
            natureTypes = listOf(
                "Fire",
                "Lightning",
                "Wind",
                "Water",
                "Earth"
            )
        ),
        Hero(
            id = 11,
            name = "Urashiki",
            image = "/images/urashiki.jpg",
            about = "Urashiki Ōtsutsuki (大筒木ウラシキ, Ōtsutsuki Urashiki) was a low-ranking member of the Ōtsutsuki clan's main family, sent to assist Momoshiki and Kinshiki on their mission to investigate Kaguya's whereabouts and gather the chakra of the God Tree on Earth. Compared to his comrades, Urashiki had been shown to have a rather laid-back and jovial personality. He was quite willing to joke along with Momoshiki and Kinshiki, and disparaged on how serious they are.",
            rating = 3.4,
            power = 95,
            month = "Jan",
            day = "1",
            family = listOf(
                "Otsutsuki Clan"
            ),
            abilities = listOf(
                "Space–Time",
                "Rinnegan",
                "Byakugan"
            ),
            natureTypes = listOf(
                "Fire",
                "Lightning",
                "Wind",
                "Earth"
            )
        ),
        Hero(
            id = 12,
            name = "Code",
            image = "/images/code.jpg",
            about = "Code (コード, Kōdo) is the last active Inner from Kara. Carrying Isshiki Ōtsutsuki's legacy within him, he inherits the Ōtsutsuki Clan's will to become a Celestial Being and continually evolve. At the time Kawaki was brought to Kara, Code was one of fifteen candidates in Jigen and Amado's Ōtsutsuki ritual to screen for a Kāma vessel for Isshiki. Only Kawaki survived to become an actual vessel.",
            rating = 4.8,
            power = 99,
            month = "Jan",
            day = "1",
            family = listOf(
                "Unknown"
            ),
            abilities = listOf(
                "White Karma",
                "Transformation",
                "Genjutsu"
            ),
            natureTypes = listOf(
                "Unknown"
            )
        ),
        Hero(
            id = 13,
            name = "Amado",
            image = "/images/amado.jpg",
            about = "Amado (アマド, Amado) is a former Inner from the organisation Kara and the head of its research and development division. He has since defected to Konohagakure, where he used a mix of bluffs and gifts to gain official citizenship for the Hokage's protection. Amado had a daughter who died twelve years prior to the reign of the Seventh Hokage. In his quest to kill Isshiki Ōtsutsuki, Amado joined Kara and was granted the rank of Inner, serving as the head of its research and development division.",
            rating = 5.0,
            power = 90,
            month = "Jan",
            day = "1",
            family = listOf(
                "Unknown"
            ),
            abilities = listOf(
                "Science",
                "Intelligence",
                "Trickery"
            ),
            natureTypes = listOf(
                "Unknown"
            )
        ),
        Hero(
            id = 14,
            name = "Koji",
            image = "/images/koji.jpg",
            about = "Koji Kashin (果心居士, Kashin Koji) is a clone of Jiraiya that was created by Amado for the purpose of killing Isshiki Ōtsutsuki. A former Inner of Kara, he was in charge of the sector on the outskirts of the Land of Fire. An enigmatic man, Koji has a very stoic and straightforward nature that follows a no-nonsense view. Arrogant as he may appear, he has consistently shown himself to be a very rational and perceptive man.",
            rating = 4.5,
            power = 90,
            month = "Jan",
            day = "1",
            family = listOf(
                "Jiraiya"
            ),
            abilities = listOf(
                "Senin Mode",
                "Rasengan",
                "Shadow Clone"
            ),
            natureTypes = listOf(
                "Fire",
                "Earth"
            )
        ),
        Hero(
            id = 15,
            name = "Edward Elric",
            image = "/images/edward-elric.jpg",
            about = "Code (コード, Kōdo) is the last active Inner from Kara. Carrying Isshiki Ōtsutsuki's legacy within him, he inherits the Ōtsutsuki Clan's will to become a Celestial Being and continually evolve. At the time Kawaki was brought to Kara, Code was one of fifteen candidates in Jigen and Amado's Ōtsutsuki ritual to screen for a Kāma vessel for Isshiki. Only Kawaki survived to become an actual vessel.",
            rating = 4.8,
            power = 99,
            month = "Jan",
            day = "1st",
            family = listOf(
                "Unknown"
            ),
            abilities = listOf(
                "White Karma",
                "Transformation",
                "Genjutsu"
            ),
            natureTypes = listOf(
                "Unknown"
            )
        ),Hero(
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