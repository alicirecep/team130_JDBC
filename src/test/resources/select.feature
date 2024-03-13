Feature: Select Query Execute

  @query01
  Scenario: Database içindeki "deposits" toblosunda "amount" değeri
            100$ ile 500$ arasında olan user_id’leri doğrulayınız.


    * Database baglantisi kurulur.
    * Query01 hazirlanir ve execute edilir.
    * ResultSet01 sonuclari islenir.
    * Database baglantisi kapatilir.

