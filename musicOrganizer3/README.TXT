Music Organizer: Representación de un organizador de música 
(lista de reproducción) en base a dos clases principales:
- Pista: variante de la clase 'Track' de los proyectos de
BlueJ. Representa una pista de música con su correspondiente 
título y artista.
- Album: variante de la clase 'MusicOrganizer' de los proyectos
de BlueJ. Representa un album de música. En un album, todas
las pistas corresponden a un mismo artista, el artista del album.

Tareas a implementar en clase Pista:
- Implementar chequeo de precondición de 
    public Pista(String artista, String titulo)
    (se describe funcionalidad esperada en el comentario del método)
- Implementar funcionalidad de:
    public boolean repOK()
    (se describe funcionalidad esperada en el comentario del método)
    
Tareas a implementar en clase Album:
- Implementar chequeo de precondición de 
    public void agregarPista(Pista pista)
    (se describe funcionalidad esperada en el comentario del método)
- Implementar funcionalidad de:
    public boolean pertenece(String titulo)
    (se describe funcionalidad esperada en el comentario del método)
