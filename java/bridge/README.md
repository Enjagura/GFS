# GFS - WI - ENTWURFSMUSTER - BRIDGE
GFS Wirtschaftsinformatik - Entwurfsmuster - Bridge

## Inhaltsverzeichnis - Dateien in diesem Beispiel
1. [Device.java](./Device.java)
2. [Radio.java](./Radio.java)
3. [Tv.java](./Tv.java)

## <h2>Bridge</h2>
Die Bridge befindet sich inder [Device.java](./Device.java) Datei. Dort wird ein Standart, welcher von allen gezeigten Geräten verwendet werden kann definiert.
</br></br>
Das Bridge Pattern trennt die Abstraktion (was etwas tut) von der Implementierung (wie es gemacht wird), sodass beide unabhängig voneinander geändert werden können. Dadurch wird der Code flexibler, da die abstrakten und konkreten Teile voneinander getrennt sind.
