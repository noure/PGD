<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Gestion Bulletin Officiel</title>



<SCRIPT LANGUAGE="JavaScript">
	function Ajouter(form) {
		var o = new Option(form.libelle.value, form.valeur.value);
		form.liste.options[form.liste.options.length] = o;
	}
	function Inserer(form) {
		var o = new Option(form.libelle.value, form.valeur.value);
		if (form.liste.options.selectedIndex >= 0) {
			form.liste.options.length++;
			for (var i = form.liste.options.length - 1; i > form.liste.options.selectedIndex; i--) {
				var p = new Option(form.liste.options[i - 1].text,
						form.liste.options[i - 1].value);
				form.liste.options[i] = p;
			}
			form.liste.options[form.liste.options.selectedIndex] = o;
		} else {
			alert("Insertion impossible. Sélectionnez une ligne");
		}
	}
	function Supprimer(list) {
		if (list.options.selectedIndex >= 0) {
			list.options[list.options.selectedIndex] = null;
		} else {
			alert("Suppression impossible : aucune ligne sélectionnée");
		}
	}

	function SupprimerTout(list) {
		list.options.length = 0;
	}
</SCRIPT>
</HEAD>

<BODY bgcolor="#FFFFFF">
	<FONT FACE="Arial" SIZE='-1' COLOR="#000099">

		<CENTER>
			<BIG><B>Ajouter, insérer et supprimer un mot dans la list
					des tags</B></BIG>
		</CENTER>


		<FORM name="formulaire">

			<s:form type=textfield name="libelle" size=15 value="texte"
				label="Libellé" />
			<s:form type=textfield name="valeur" size=15 value="texte"
				label="Valeur" />
			<s:form type=button Value="Ajouter" onClick="Ajouter(this.form)" />
			<s:form type=button Value="Insérer" onClick="Inserer(this.form)" />
			<BR> <BR> Sélectionnez une ligne de la liste pour voir le
			détail <SELECT align=top name="liste" size=3
				onChange="alert('Libellé : '+this.options[this.selectedIndex].text+'\nValeur : '+this.options[this.selectedIndex].value)">
				<OPTION value="Initiale">Ligne initiale</OPTION>
			</SELECT><BR> <BR> <INPUT type="button"
				value="Supprimer la sélection" onClick="Supprimer(this.form.liste)">
			<INPUT type="button" value="Supprimer tout"
				onClick="SupprimerTout(this.form.liste)"> <BR> <BR>
			Le bouton Ajouter ajoute à la fin de la liste la ligne.<BR> Le
			bouton Insérer insère la nouvelle ligne avant la ligne sélectionnée.<BR>
			Le bouton Supprimer la sélection supprime la ligne sélectionnée dans
			la liste.<BR> Le bouton Supprimer tout supprime toutes les
			lignes.<BR>
		</FORM> <BR>
	</FONT>
</BODY>
</HTML>
