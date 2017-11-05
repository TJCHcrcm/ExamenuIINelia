package com.example.aepis01.myapplication;


public class Meta {
        /*
        Atributos
         */

        private String titulo;
        private String descripcion;
        private String imagen;


        public Meta( String titulo, String descripcion, String imagen) {

            this.titulo = titulo;
            this.descripcion = descripcion;
            this.imagen = imagen;

        }



        public String getTitulo() {
            return titulo;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public String getImagen() {
            return imagen;
        }


        /**
         * Compara los atributos de dos metas
         * @param meta Meta externa
         * @return true si son iguales, false si hay cambios
         */
        public boolean compararCon(Meta meta) {
            return this.titulo.compareTo(meta.titulo) == 0 &&
                    this.descripcion.compareTo(meta.descripcion) == 0 &&
                    this.imagen.compareTo(meta.imagen) == 0 ;
        }
}
