# airports-search
Тестовое задание на Java-разработчика.

# Задание:
Библиотека autocomplete вводимого текста

# Постановка задачи
Требуется написать консольное Java-приложение (JDK 11), позволяющее быстро искать данные аэропортов по вводимому пользователем тексту.

Данные для программы берутся из файла airports.dat. В нем находится таблица аэропортов со свойствами в формате CSV. За что отвечает каждая колонка – не важно.

Сборка проекта осуществляется с помощью Maven. После сборки исходного кода командой mvn clean package получаем airports-search-*.jar в качестве артефакта для запуска.

Пользователь запускает приложение, указывая параметром номер колонки (нумерация начинается с 1, а не с 0) по которой требуется поиск:

java –jar airports-search-*.jar 2 // запуск приложения в режиме поиска по второй колонке

После запуска программа выводит в консоль предложение ввести текст. Например, пользователь вводит «Bo» и нажимает «Enter». Программа выводит список всех строк из 
файла airports.dat, вторая колонка которых начинается на «Bo», отсортированных по этой колонке в формате «<Найденной значение нужной колонки>[<Полностью строка>]». 

Для строковых колонок, значения которых заключены в кавычки, должен быть лексикографический порядок, а для числовых — числовой. Не буквенные и не цифровые 
символы также участвуют в поиске. Регистр букв не имеет значения.
