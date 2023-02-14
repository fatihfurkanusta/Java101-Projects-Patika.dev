public class Match {
    Fighter f1, f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {
        if (isCheck()) {
            int i=0;
            System.out.println("----------DÖVÜŞ BAŞLIYOR----------");
            System.out.println("Muhammed Ali Başlangıç Sağlığı: "+ f1.health);
            System.out.println("Mike Tyson Başlangıç Sağlığı: "+ f2.health);
            if(firstHit()){
                System.out.println("İlk vuruşu "+f1.name+" yapıyor...");
                while (this.f1.health > 0 && this.f2.health > 0) { //*************************************************************************
                    i++;
                    System.out.println("-----ROUND " + i + "-----");

                    this.f2.health = this.f1.hait(this.f2);

                    if (isWin()) {
                        System.out.println("Muhammed Ali Sağlığı: " + f1.health);
                        System.out.println("Mike Tyson Sağlığı: " + f2.health);
                        break;
                    }

                    this.f1.health = this.f2.hit(this.f1);

                    if (isWin()) {
                        System.out.println("Muhammed Ali Sağlığı: " + f1.health);
                        System.out.println("Mike Tyson Sağlığı: " + f2.health);
                        break;

                    }
                }
            }
            else{
                System.out.println("İlk vuruşu "+f2.name+" yapıyor...");
                while (this.f1.health > 0 && this.f2.health > 0) { //*************************************************************************
                    i++;
                    System.out.println("-----ROUND " + i + "-----");
                    this.f2.health = this.f1.hit(this.f2);
                    if (isWin()) {
                        System.out.println("Muhammed Ali Sağlığı: " + f1.health);
                        System.out.println("Mike Tyson Sağlığı: " + f2.health);
                        break;
                    }
                    this.f1.health = this.f2.hit(this.f1);
                    if (isWin()) {
                        System.out.println("Muhammed Ali Sağlığı: " + f1.health);
                        System.out.println("Mike Tyson Sağlığı: " + f2.health);
                        break;
                    }
                }
            }
        }else{
            System.out.println("Sporcuların Sikletleri Uyumsuz. ");
        }
    }


    boolean isCheck() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight)
                && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean isWin(){
        if(this.f1.health == 0){
            System.out.println(f2.name+" kazandı.");
            return true;
        }
        if(this.f2.health==0){
            System.out.println(f1.name+" kazandı.");
            return true;
        }
        else{
            return false;
        }
    }
    boolean firstHit(){
        double randomNumber = Math.random() * 100;
        return randomNumber<=50;
    }

}
