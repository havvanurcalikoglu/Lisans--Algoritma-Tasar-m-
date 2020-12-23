# Lisans--Algoritma-Tasarimi
  
## Bilgisayar Mühendisliği Lisans 4. Sınıf Dersi    
   

## 1- Kd Tree Nearest Neighbor Search Algorithm

KNN algoritması bilgisayarlı görü ve makine öğrenmesi süreçlerinde çokca kullanılan bir algoritmadır. Bu efektif ve anlaması kolay algoritmanın en uzun süren kısmı bir noktalar kümesinden seçilmiş bir noktaya en yakın k komşuyu bulma kısmıdır. Bu kısımda yürütülen algoritmalara Nearest Neighbor Search algoritmaları denir.
Uzayda bir noktalar kümesi içinden herhangi bir P noktası seçilir. Bu küme içinden P’ye en yakın k adet noktayı bulma problemine Nearest Neighbor Search denir.
Bilgisayar biliminde, K-D tree k boyutlu bir uzayda bir dizi noktayı tanımlayan bir veri yapısıdır. K-d ağaçları, çok boyutlu bir arama anahtarını içeren aramalar gibi çeşitli uygulamalar için yararlı bir veri yapısıdır.Dizi arama işlemlerini çok verimli hale getirir.Örneğin en yakın komşu uzaydaki bir noktaya en yakın noktayı bulmak veya bir daire içindeki tüm komşu noktaları bulmak için kullanılabilir.
Bu bir binary search tree (ikili arama ağacı)’dir. Her düğümün sağ ve sol olmak üzere iki alt düğümü bulunmaktadır.Her seviye belirli bir boyut üzerindeki alanı böler. Örneğin 3 boyutlu uzayda kök düğümde (birinci seviye) tüm çocuklar ilk boyuta göre bölünürler, X’ten daha büyük X değerine sahip noktalar ağacın sağ düğümüne, daha küçük X değerine sahip noktalar sol düğüme gider. İkinci seviyede yeni oluşturulmuş olan düğümler aynı ölçütü kullanarak Y eksenini üzerinde yapılır. Üçüncü seviyede (düğümler) Z eksenini kullanırız. Dördüncü seviyede, X eksenine geri döneceğiz, vb. Genellikle, orta nokta her seviyede kök olarak seçilir.
K boyutlu uzayı gruplamak için bir  hiperküp kullanıyoruz. Kısaca, hiperküp k boyutlu uzayda çalışan bir kutudur. 

![Kd Tree](https://user-images.githubusercontent.com/56633000/102958032-11b5d800-44ed-11eb-9358-7e8385eca15f.png)  
 
X ve Y kordinatları düzleminde tüm noktalar x ve y olmak üzere iki kordinat değerine sahiptir.Birinci noktanın kordinatları x1,y1 ikinci noktanınkiler ise x2,y2 olmak üzere iki nokta arasındaki en yakın uzunluk kök içerisinde (x1-x2)2 + (y1-y2)2 olarak hesaplanır.
K-d ağaçları sayesinde tüm noktaların aradığımız noktaya olan uzaklıklarını bu formülle hesaplayıp sıralama derdinden kurtulmuş oluyoruz.K-d ağacında x ve y kordinat değerlerine göre alandaki noktaları parçalara bölerek bir ağaç oluşturuyoruz.
K-d ağacı  bir (Binary Search Tree) ikili arama ağacı olduğundan, oluştururken yararlanacağımız kurala gelecek olursak; normal ikili arama ağaçlarında sayısal değer olarak büyüklük küçüklük durumuna bakardık.Burda da koordinatların değerine bakarak ağacı oluşturacağız ancak bir seviyede x kordinatını bir seviyede ise y kordinatını dikkate alacağız.


## 2-D Ağacı

Bir  2d-ağaç  , Binary Search Tree'nin (İkili Arama Ağacı)  iki boyutlu anahtarlara genellemesidir.
Buradaki fikir, aşağıdaki şekilde gösterildiği gibi , x koordinatlarından başlayarak, noktaların x ve  y koordinatlarını anahtarlar olarak  kullanarak, düğümlerdeki noktalarla bir BST oluşturmaktır.

![2](https://user-images.githubusercontent.com/56633000/102958328-a7516780-44ed-11eb-8e59-3e9c846d5082.png)  


## En Yakın Komşu Bulma 
En yakın komşu araması :  Belirli bir sorgu noktasına en yakın noktayı bulmak için, kökten başlayın ve aşağıdaki budama kuralını kullanarak her iki alt ağaçta da yinelemeli olarak arama yapın : Şimdiye kadar keşfedilen en yakın nokta, sorgu noktası ile arasındaki mesafeden daha yakınsa bir düğüme karşılık gelen dikdörtgen, bu düğümü (veya alt ağaçlarını) keşfetmeye gerek yoktur. Yani, bir düğümü yalnızca o ana kadar bulunan en iyisinden daha yakın bir nokta içeriyorsa arayın. Budama kuralının etkinliği, yakın bir noktayı hızla bulmaya bağlıdır. Bunu yapmak için, yinelemeli yöntemi düzenleyin, böylece aşağı inilebilecek iki olası alt ağaç olduğunda, önce bölme çizgisinin sorgu noktasıyla aynı tarafındaki alt ağacı seçersiniz. ; ilk alt ağacın keşfedilmesi sırasında bulunan en yakın nokta, ikinci alt ağacın budanmasını sağlayabilir.



K - En yakın komşu araması : Bu yöntem  , sorgu noktasına en yakın olan k noktasını döndürür  (herhangi bir sırada); n  ≤  k  ise veri yapısındaki tüm  n noktayı  döndür . Bunu verimli bir şekilde yapmalıdır, yani kd-ağaç en yakın komşu aramasından tekniği kullanarak yapmalıdır.



![3](https://user-images.githubusercontent.com/56633000/102958522-221a8280-44ee-11eb-923f-9d230393df94.png)  
 

Bir yaprağa ulaşana kadar K-d ağacında x'i arayın.  
• Mevcut-en iyi yaprak noktasını düşünün.  
• Arama yolu ve her bir düğüm boyunca:   
•	Mevcut nokta daha iyiyse, mevcut-en iyiyi yeniden tanımlayın  
•	En iyisi keşfedilmemiş çocukta olabilirse keşfedilmemiş çocuğu tekrarlayın.  

Kd-Tree, BSP Tree’nin özelleştirilmiş bir halidir. Bu yapıda uzay, koordinat eksenlerine paralel bir dikdörtgen prizma olarak düşünülür. Uzay, belirli bir maksimum üçgen sayısına ya da maksimum derinliğe ulaşana kadar yine dikdörtgen prizma şeklindeki alt uzaylara bölünür. Kd-Tree’de uzay, bir kenarının orta noktasından ikiye bölünmek zorunda değildir. Yani bölünen alt uzaylar, geometrik olarak birbirlerine eşit değildir. Bunun yerine Kd-Tree’de uzay alt uzaylara, toplam maliyeti en aza indirecek şekilde bölünür. Bu amaçla çeşitli sezgisel yöntemler geliştirilmiştir.  

### Kd-Tree’nin Oluşturulması
Kd-Tree’nin kullanılması için, öncelikle üçgenlerden oluşan cisim için bir Kd-Tree’nin oluşturulması gerekmektedir. KdTree’nin oluşturulması, ilk bakıldığında ciddi bir hesaplama yükü getirse de, yapı bir kere oluşturulup cismin bütün açılardan görüntüsünü elde etmekte kullanılabileceği ve bu işlemlerde oldukça yüksek bir başarım sağlayacağı için bu hesaplama yükü, göz ardı edilebilecek düzeydedir. Daha önce bahsedildiği gibi, Kd-Tree oluşturulurken her aşamada uzay, iki alt uzaya bölünür. Uzayın bölüneceği düzlemi belirlemek için çeşitli sezgisel yöntemler kullanılır. Bu yöntemlerin en çok kullanılanları, “Uzaysal Medyan Yaklaşımı” ve “Yüzey Alanı Sezgisel Yaklaşımı”dır. Kd-Tree oluşturulması konusunda bir diğer önemli nokta, üçgenlerin bölünen her alt uzayın içinde olup olmadığının hesaplanmasıdır. Bunun için de kutu-üçgen kesişim algoritmaları geliştirilmiştir. Kd-Tree, bu iki ölçüte göre özyinelemeli olarak oluşturulur.
 Kd-Tree’nin oluşturulma algoritması şu şekildedir:

 
### Bölme Yüzeyi’nin Belirlenmesi
Kd-Tree’nin oluşturulmasında en önemli işlemlerden biri, bölme yüzeyinin hesaplanmasıdır. Bunun için çeşitli metotlar geliştirilmiştir. 
Uzaysal Ortanca Yaklaşımı : Bölme yüzeyinin belirlenmesindeki en basit, bununla birlikte en çok kullanılan yöntem, uzaysal ortanca yaklaşımıdır. Uzaysal ortanca yaklaşımında bölünecek eksen, sıralı olarak belirlenir. Bölme düzlemi ise, sıradaki ekseni dik olarak ortadan ikiye kesen bir düzlemdir.

 
Bu formülde pk bölme ekseni, D(V) şu andaki ağaç derinliği, pє bölme yüzeyi, Vmin,pk bölme ekseninin en küçük noktası, Vmax,pk ise bölme ekseninin en büyük noktasıdır.
Kd-Tree Üzerinde Arama
Kd-Tree oluşturulurken, her adımda o alt uzayın içerdiği üçgenler belirlenir. Alt uzaylar birer dikdörtgen prizma (kutu) olarak temsil edildiğinden, bir üçgenin bir alt uzayın içinde olup olmadığını ya da herhangi bir yüzeyden alt uzayı kesip kesmediğini belirlemek için bir kutu-üçgen kesişim algoritması kullanılmalıdır.
Kd-Tree için özyinelemeli arama algoritması, esasen genel BSP-Tree’ler için Jansen tarafından 1986 yılında geliştirilmiş ve yayınlanmıştır. Bu algoritmada her derinlikte ışının kestiği alt uzay ya da uzaylar belirlenir. Işın, herhangi bir alt uzayı kesmiyorsa, alt uzayların içerdiği üçgenleri de kesmiyor demektir. Işın, alt uzaylardan birini kesiyorsa, arama alt uzayın sahip olduğu çocuk alt uzaylar için tekrarlanır. Eğer ışın bir derinlikteki iki alt uzayı birden kesiyorsa, aramaya ışının kaynağına en yakın alt uzaydan başlanır. Bu şekilde özyinelemeli olarak bir yaprak düğüme ulaşıldığında, o yaprak düğümün içerdiği bütün üçgenler için ışın-üçgen kesişim algoritması yürütülerek ışının kestiği en yakın üçgen bulunur.



### Big-O Notasyonu Zaman Karmaşıklığı  
Algoritma      Ortalama         En Kötü Durum  
Arama		    O(logn)	    O(n)  
Ekleme	    O(logn)    	O(n)  
Silme		    O(logn)	    O(n)  
Uzay		    O(n)		    O(n)  



