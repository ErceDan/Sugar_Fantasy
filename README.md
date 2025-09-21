# 🍬 Juego de Sabores (Java RPG por turnos)

Este proyecto es un **juego de texto por turnos en Java**, inspirado en los sabores que percibe la lengua humana:  
**Dulce, Salado, Ácido y Amargo** (con la posibilidad de un quinto sabor, *Umami* 👀).  

El objetivo principal del proyecto es **practicar Programación Orientada a Objetos (POO)** en Java:  
- Uso de **clases, herencia y polimorfismo**.  
- Gestión de **héroes y habilidades**.  
- Separación de responsabilidades mediante **paquetes** (`core`, `gestor`, `app`).  
- Implementación progresiva de un sistema de **combate por turnos**.  

---

## 📂 Estructura de paquetes

src/
├─ core/
│ ├─ Heroe.java
│ ├─ HeroeFamily.java
│ ├─ Habilidad.java
│ └─ LibroHabilidades.java
│
├─ gestor/
│ ├─ HeroeManager.java
│ ├─ HabilidadManager.java
│ └─ Juego.java
│
└─ app/
└─ SugarFantasy.java


**Explicación de paquetes:**
- `core`: clases que representan el “mundo del juego” (datos puros).  
- `servicio`: gestores de colecciones y lógica de negocio (crear, buscar, modificar héroes, combates, etc.).  
- `app`: contiene el `Main` y menús interactivos con el usuario.  

---

## 🎮 Funcionalidades previstas
- **Gestión de héroes**: crear, mostrar, modificar y eliminar héroes.  
- **Gestión de habilidades**: asignar habilidades a cada héroe mediante un libro de habilidades.  
- **Juego**:  
  - *Duelo*: combate entre dos héroes.  
  - *Arcade*: un héroe se enfrenta a enemigos generados aleatoriamente.  

---

## 🛠️ Estado actual
El proyecto se encuentra en fase inicial:  
- Estructura de menús implementada.  
- Clases base (`Heroe`, `HeroeFamily`, `Habilidad`, `LibroHabilidades`) en construcción.  
- `HeroeManager` y demás gestores planificados.  

---

## 🚀 Próximos pasos
1. Implementar `HeroeManager` con un almacenamiento en memoria (`ArrayList`).  
2. Desarrollar la lógica de creación, listado y búsqueda de héroes.  
3. Extender las habilidades y comenzar con el sistema de combate.  

---

## 🏗️ Tecnologías
- **Java 17+**  
- **Git/GitHub** para control de versiones  
