Music Organizer2: Representación de un organizador de música 
(lista de reproducción) en base a dos clases principales:
- Pista: variante de la clase 'Track' de los proyectos de
BlueJ. Representa una pista de música con su correspondiente 
título, artista y duración en segundos.
- ListaReproduccion: variante de la clase 'MusicOrganizer' de los proyectos
de BlueJ. Representa una lista de música. Una lista de música es 
simplemente una lista de pistas.

Tareas a implementar en clase Pista:
- Implementar chequeo de precondición de 
    public Pista(String artista, String titulo, int duracion)
    (se describe funcionalidad esperada en el comentario del método)
- Implementar funcionalidad de:
    public boolean repOK()
    (se describe funcionalidad esperada en el comentario del método)
    
Tareas a implementar en clase ListaReproduccion:
- Implementar funcionalidad de:
    public void imprimirPistas()
    (se describe funcionalidad esperada en el comentario del método)
    public boolean pertenece(String artista)
    (se describe funcionalidad esperada en el comentario del método)
