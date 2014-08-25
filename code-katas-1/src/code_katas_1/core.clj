(ns code-katas-1.core)

"estoy probando y corriendo todo en http://tryclj.com/ porque no me anda ni para atras bien en mi pc"

(defn filter-odd
  "Escribir una funcion que retorne solamente los numeros impares de
   una secuencia"
  [s]
  (take-nth 2 (rest s))
  )

(defn nil-key
  "Escribir una funcion que dada una clave y un mapa, devuelva true, solamente si el mapa
   contiene una entrada con esa clave, y su valor es nil"
  [k m]
  "lo probe con esto (nil-key :a {:a nil, :b 2, :c 3}) "
  
  (= (m k) nil)
  )
  
 


(defn range
  "Escribir una funcion que cree una lista de enteros en un rango dado.
   Restricciones: range"
  [start end]
  "el problema es que si deberia terminar en 10 toma 10 valores sumando de a uno, osea que si empieza desde otro numero q no sea 0 no sirve"
  "probe con el take while antes del take, probe redifiniendo el end como      (= end (- end start)) y no me anda ni para atras "
  ( take end (iterate (partial + 1 ) start))

  )

(defn compress-sequence
  "Escribir una funcion que elimine los duplicados consecutivos
   de una secuencia"
  [s]
  (reduce #(if-not (= (last %1) %2)
             (conj %1 %2)
             %1)
          []
          s))
(defn max-value
  "Escribir una funcion que reciba un numero variable de parametros
   y retorne el que tenga el valor mayor
   Restricciones: max y max-key"
  [& args]
  "si se ordena de menor a mayor y obtenemos el ultimo deberia darnos el mas alto, no es muy optimo pero funciona"
  (last (sort args)) 
  )

(defn split-two
  "Escribir una funcion que parta una secuencia en dos partes
   Restricciones: split-at"
  [length s] 
 
  (drop-last (/ length 2) s)  )

(defn inter-two
  "Escribir una funcion que reciba dos secuencias y retorne el primero de cada una,
   luego el segundo de cada una, luego el tercero, etc.
   Restricciones: interleave"
  [s1 s2] 
  "tambien si lo que se quisiera hacer fuese construir un hashmap podria hacerse similarmente (zipmap s1 s2)"
  (map vector s1 s2)
  )

(defn retrieve-caps
  "Escribir una funcion que reciba un string y devuelva un nuevo string conteniendo
   solamente las mayusculas."
  [text]
   (clojure.string/upper-case text)

  )

(defn find-truth
  "Escribir una funcion que tome un numero variable de booleans, y devuelva true
   solamente si alguno de los parametros son true, pero no todos son true. En otro
   caso debera retornar false"
  [& xs]
  
  
  )

(defn zip-map
  "Escribir una funcion que reciba un vector de claves y un vector de valores, y
   construya un mapa a partir de ellos.
   Restricciones: zipmap"
  [k v]
  )
