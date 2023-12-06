# Testing dengan Selenium dan Cucumber

Pada repositor ini teradapat kode simpel bagaimana cara untuk melakukan testing dengan menggunakan
Selenium dan Cucumber dengan basis bahasa pemrograman Java. Untuk pengetesan sudah terdapat pengetesan secara
positif maupun negative dan pembatasan testing.

## Struktur Proyek (Project Structure)
| Folder      | Description                                                 |
|-------------|-------------------------------------------------------------|
| src         | Sumber kode pada projek ini                                 |
| reports     | Folder penyimpanan file report setelah melakukan pengetesan |
| test        | Unit tests untuk projek                                     |
| com.example | Tempat dimana meletakan semua logika pengetesan             |
| resource    | Deskripsi fitur dari yang diuji pada projek ini             |


## Setting

Anda dapat menjalankan projek ini dengan ketentuan:
* IDE (Disarankan Intellj / Vscode), namun dapat menggunakan yang lain sesuai favorit IDE Anda
* Java 17-19 SE

Jika sudah terinstall, rubah dahulu kode pada task yang terdapat pada build.gradle dan tempat fold pada CucumberTesting di package src/test/java/com.example:

```
...

@CucumberOptions(
        glue = {"(Sesuaikan dengan tempat Package)"},
        features = {"(sesuaikan dengan tempat folder anda menyimpan file feature)"},
        plugin = {"pretty"}
)

...

*Note: Kurung buka tutup dihilangkan / dihapus
```
```agsl
...

task tesCucumber(){
    description ("Menjalankan Tes Cucumber")
    dependsOn assemble, compileTestJava
    doLast {
        javaexec {
            main = "io.cucumber.core.cli.Main"
            classpath = configurations.cucumberRuntime + sourceSets.main.output + sourceSets.test.output
            args = [
                    '--plugin', 'html:reports/index.html',
                    '--plugin', 'json:reports/cucumber.json',
                    '--plugin', 'pretty',
                    '--glue', '(Sesuaikan dengan package anda)',
                    '--tags', "${tags}",
                    'src/test/resources'
            ]
        }
    }
}

...

*Note: Kurung buka tutup dihilangkan / dihapus
```
Anda juga dapa merubah kalimat pada task dengan kalimat anda sendiri seperti:
```
...
task (Kalimat anda sendiri){
    ...
    ...
}
...

*Note: Kurung buka tutup dihilangkan / dihapus
```
### Dependencies
Untuk pengaturan dependencies terdapat pada file build.gradle. Berikut untuk dependencies yang ada pada projek:
```
...

dependencies {
    testImplementation platform('org.junit:junit-bom:5.9.1')
    testImplementation 'org.junit.jupiter:junit-jupiter'
    implementation group: 'org.seleniumhq.selenium', name: 'selenium-java', version: '4.15.0'
    implementation group: 'io.github.bonigarcia', name: 'webdrivermanager', version: '5.5.3'
    testImplementation 'io.cucumber:cucumber-java:7.14.1'
    testImplementation 'io.cucumber:cucumber-junit:7.14.1'
}

...
```
Disini dependencies sudah dipasangkan pada file build.gradle, namun jika anda mengalami kendala dependencies 
anda dapat mengunjungi website [Maven Repository]("https://mvnrepository.com/") dan mengganti dependencies yang terjadi error.

## Cara Run Projek
Berikut cara untuk menjalankan projek keseluruhan di terminal menggunakan custom task yang telah dibuat:

```
./gradlew task (nama custom task anda)
```
Pada projek ini, untuk custom task menggunakan task tesCucumber, maka penulisan pada terminal seperti berikut:
```
./gradlew task tesCucumber
```

Untuk dokumentasi Selenium dapat dilihat [disini]("https://www.selenium.dev/documentation/")

Untuk dokumentasi Cucumber dapat dilihat [disini]("https://cucumber.io/docs/cucumber/")

Untuk download Java versi 17 - 19 [disini]("https://jdk.java.net/archive/")

*Terjadi kesalahan pembacaan Languages repositori yang seharusnya Java Gherkin menjadi Html. Jika ada saran atau refrensi untuk perbaikan sangat diterima.
