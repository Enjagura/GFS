# GFS - WI - ARTEN & VORTEILE
GFS Wirtschaftsinformatik - Arten & Vorteile

## <h2>Verschiedene Arten von Entwurfsmustern (Design patterns)</h2>
<strong>Entwurfsmuster lassen sich in drei verschiedene Arten unterteilen:</strong>
<ul>
   <li><strong>Erzeugungsmuster</strong> befassen sich mit der effizienten erzeugung von Objekten. Sie helfen dabei die Art und Weise zu definieren, wie Objekte erstellt werden können. </li><li><strong>Strukturmuster</strong> kümmern sich um die Struktur und Organisation von Klassen und Objekten in größeren Systemen. Diese Entwurfsmuster verbessern das Zusammenspiel der Klassen. </li><li><strong>Verhaltensmuster</strong> dagegen befassen sich mit dem Austausch von Informationen zwischen dein einzelnen Objekten. Sie definieren verschiedene Interaktionen verschiedener Elemente eines Systems und erleichtern die Implementierung von Kommunikationsmustern.</li>
</ul>

<h3>Beispiele für verschiedene Entwurfsmuster sind:</h3>

<strong>Erzeugungsmuster (Creational Patterns):</strong>
<ul>
  <li>Factory Method Pattern</li>
  <li>Builder Pattern</li>
  <li>Prototype Pattern</li>
</ul>
<strong>Strukturmuster (Structural Patterns):</strong>
<ul>
  <li>Facade Pattern</li>
  <li>Adapter Pattern <strong>(1)</strong></li>
  <li>Bridge Pattern <strong>(2)</strong></li>
</ul>
<strong>Verhaltensmuster (Behavioral Patterns):</strong>
<ul>
  <li>Observer Pattern</li>
  <li>State Pattern</li>
  <li>Visitor Pattern</li>
</ul>

<strong>(1) </strong> Nachprogrammiert unter [/java/adapter](https://github.com/Enjagura/GFS/tree/main/java/adapter) </br>
<strong>(2) </strong> Nachprogrammiert unter [/java/bridge](https://github.com/Enjagura/GFS/tree/main/java/bridge)

## <h2>Vorteile von Entwurfsmustern (Design patterns)</h2>
<strong>Warum man Entwurfsmuster verwenden sollte und was diese in einem System/Code bringen.</strong>
<ol>
   <li><strong>Wiederverwendbarkeit von Code </strong><ul>
      <li>Immer wiederkehrende code muss nicht immer neu geschrieben werden. So kann immer wieder, wenn ein Entwurfsmuster benötig wird, dieses aufgerufen werden.</li>
      <li>Erspart somit unnötige Klassen und mach den Code übersichtlicher und kürzer.</li>
   </ul></li>
   <li><strong>Wartbarkeit von Code </strong><ul>
      <li>Code, welcher oft verwendet wird,muss bei einer Verwendung von Entwurfsmustern, nur an einer Stelle verändert werden.</li>
      <li>Code kann so übersichtlich und kurz gehalten werden.</li>
      <li>Große Verschachtelungen können vermieden werden.</li>
   </ul></li>
   <li><strong>Skalierbarkeit einer Anwendung </strong><ul>
      <li>Entwurfsmuster steigern die Leistung einer Anwendung unter einer hohen Anzahl von Anfragen. Durch die verwendung von Entwurfsmustern wird die Zeit, welche eine Anwendung benötigt, um eine Anfrage zu verarbeiten, auf ein minimum rediziert.</li>
      <li>Somit ergiebt sich ein effektiver Umgang mit den Ressourcen (Bandbreite, RAM,CPU, etc.), welche einer Anwendung zu verfügung gestellt werden.</li>
   </ul></li>
   <li><strong>Lesbarkeit von Code </strong><ul>
      <li>Da bei der Verwendung eines Entwurfsmusters der Code reduziert wird, ist dieser einfacher zu lesen und zu verstehen.</li>
      <li>Weiter helfen Entwurfsmuster bei einer übersichtlichen Darstellung des Codes. Verschiede Funktionen und Klassen können so einfach formatiert undübersichtlich in wenigen Zeilen dargestellt werden.</li>
   </ul></li>
</ol>

## <h2>Beispiele von Entwurfsmustern in Java</h2>
Eine genaue Beschreibung und Erklärung zu den jeweiligen Entwursmustern befindet sich direkt in deren Ordnern (README.md).</br></br>

Dargestellt habe ich die verwendung von Entwurfsmustern anhand von zwei verschiedenen, kleinen Anwendungen.
Eine von diesen ist eine Bridge, zur Einbindung von verschiedenen Geräten. 
Die Zweite Anwendung ist ein Adapter-Muster, um zu überprüfen, ob verschiedene Objkete kompatibel sind. </br></br>
Aufrufbar sind die Anwendungen unter diesen Verknüpfungen: </br>
(1) [/java/adapter](https://github.com/Enjagura/GFS/tree/main/java/adapter) </br>
(2) [/java/bridge](https://github.com/Enjagura/GFS/tree/main/java/bridge)
