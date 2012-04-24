SUMMARY = "Linux Containers tools"
DESCRIPTION = "Linux containers are a light weight isolation system for Linux."
HOMEPAGE = "http://lxc.sourceforge.net"
LICENSE = "LGPLv2.1"

PV = "0.8.0-rc2"

RDEPENDS_${PN} = "perl perl-modules"

SRC_URI = "git://lxc.git.sourceforge.net/gitroot/lxc/lxc"
SRCREV = "ed55bf5203aca88809d979b289d6b2280a18e79c"

inherit autotools

LIC_FILES_CHKSUM = "file://COPYING;md5=fbc093901857fcd118f065f900982c24"

S = "${WORKDIR}/git"

EXTRA_OECONF = "--disable-doc --disable-rpath"

FILES_${PN}-dbg += "${libexecdir}/lxc/.debug"
