package org.knit.solutions.first_semestr.lab9.task15;
    enum Seasons{
        WINTER("Холодно", "Новый год"),
        SUMMER("Жарко", "Каникулы"),
        AUTOMN("Прохладно", "Хеллоуин"),
        SPRING("Тепло", "8 марта");
        private final String weather;
        private final String holyday;
        Seasons(String weather, String holyday){
            this.weather = weather;
            this.holyday = holyday;
        }
        public String getWeather(){return weather;}
        public String getHolyday(){return holyday;}
    }
