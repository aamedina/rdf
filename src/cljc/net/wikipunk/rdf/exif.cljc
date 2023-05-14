(ns net.wikipunk.rdf.exif
  "http://www.w3.org/2003/12/exif/ns"
  {:dc11/description
   [#voc/lstr
     "Exifフォーマットの写真からデータを取りだしてRDFで表現するため、Exif 2.2の全てのタグをRDFプロパティとして定義し、さらにそれを記述するのに必要な語彙を追加したボキャブラリ@ja"
    #voc/lstr
     "Vocabulary to describe an Exif format picture data. All Exif 2.2 tags are defined as RDF properties, as well as several terms to help this schema.@en"
    #voc/lstr
     "Vocabulaire pour décrire les données Exif d'une photographie. Toutes les balises Exif 2.2 sont définies comme des propriétés RDF, ainsi que plusieurs termes pour donner de l'aide.@fr"],
   :dc11/source "http://tsc.jeita.or.jp/avs/data/cp3451.pdf",
   :dc11/title #voc/lstr "Exif data description vocabulary@en",
   :dcterms/created #voc/lstr "2003-07-18@en",
   :dcterms/modified #voc/lstr "2003-08-19@en",
   :foaf/maker "urn:pin:MK705",
   :owl/versionInfo #voc/lstr "Experimental version.@en",
   :rdf/ns-prefix-map {"dc11"    "http://purl.org/dc/elements/1.1/",
                       "dcterms" "http://purl.org/dc/terms/",
                       "ex"      "http://example.org/",
                       "exif"    "http://www.w3.org/2003/12/exif/ns#",
                       "foaf"    "http://xmlns.com/foaf/0.1/",
                       "owl"     "http://www.w3.org/2002/07/owl#",
                       "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"    "http://www.w3.org/2000/01/rdf-schema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "exif",
   :rdfa/uri "http://www.w3.org/2003/12/exif/ns"})

(def IFD
  "An Image File Directory"
  {:db/ident        :exif/IFD,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    #voc/lstr "An Image File Directory@en",
   :rdfs/label      #voc/lstr "IFD@en",
   :rdfs/subClassOf [:rdfs/Resource :exif/IFD]})

(def _unknown
  "An Exif tag whose meaning is not known"
  {:db/ident           :exif/_unknown,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #voc/lstr "An Exif tag whose meaning is not known@en",
   :rdfs/label         #voc/lstr "Unknown tag@en",
   :rdfs/subPropertyOf :exif/_unknown})

(def apertureValue
  "The lens aperture. The unit is the APEX value."
  {:db/ident :exif/apertureValue,
   :exif/tagNumber #voc/lstr "37378@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#voc/lstr "レンズ絞り値（APEX値）。この値のルート2のベキ乗を取ると、通常の絞り値となる。例えば'5'の場合だと√2^5=F5.6@ja"
    #voc/lstr "The lens aperture. The unit is the APEX value.@en"],
   :rdfs/label #voc/lstr "ApertureValue@en",
   :rdfs/subPropertyOf
   [:exif/pictTaking :exif/apertureValue :exif/exifAttribute]})

(def artist
  "Person who created the image"
  {:db/ident           :exif/artist,
   :exif/tagNumber     #voc/lstr "315@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       #voc/lstr "Person who created the image@en",
   :rdfs/label         #voc/lstr "Artist@en",
   :rdfs/subPropertyOf [:dc11/creator :exif/exifAttribute :exif/artist]})

(def bitsPerSample
  "The number of bits per image component. In this standard each component of the image is 8 bits, so the value for this tag is 8. See also SamplesPerPixel. In JPEG compressed data a JPEG marker is used instead of this tag."
  {:db/ident :exif/bitsPerSample,
   :exif/tagNumber #voc/lstr "258@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "The number of bits per image component. In this standard each component of the image is 8 bits, so the value for this tag is 8. See also SamplesPerPixel. In JPEG compressed data a JPEG marker is used instead of this tag.@en",
   :rdfs/label #voc/lstr "BitsPerSample@en",
   :rdfs/subPropertyOf [:exif/resolution
                        :exif/imageDataStruct
                        :exif/bitsPerSample
                        :exif/exifAttribute]})

(def brightnessValue
  "The value of brightness. The unit is the APEX value. Ordinarily it is given in the range of -99.99 to 99.99. Note that if the numerator of the recorded value is FFFFFFFF.H, Unknown shall be indicated."
  {:db/ident :exif/brightnessValue,
   :exif/tagNumber #voc/lstr "37379@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#voc/lstr
     "画像撮影時の撮影対象物の明るさ（APEX値）。EVにするにはISO感度の値を足す必要があり、Ev:Exposure, Bv:BrightnessValue, Sv:SensitivityValueとしてEv=Bv+Sv Sv=log^2(ISOSpeedRating/3.125)という計算式を使う。ISO感度100の場合Sv=5、ISO200の場合Sv=6、ISO125ではSv=5.32@ja"
    #voc/lstr
     "The value of brightness. The unit is the APEX value. Ordinarily it is given in the range of -99.99 to 99.99. Note that if the numerator of the recorded value is FFFFFFFF.H, Unknown shall be indicated.@en"],
   :rdfs/label #voc/lstr "BrightnessValue@en",
   :rdfs/subPropertyOf
   [:exif/pictTaking :exif/brightnessValue :exif/exifAttribute]})

(def cfaPattern
  "The color filter array (CFA) geometric pattern of the image sensor when a one-chip color area sensor is used. It does not apply to all sensing methods."
  {:db/ident :exif/cfaPattern,
   :exif/tagNumber #voc/lstr "41730@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#voc/lstr
     "CCDに付いているColor filter array(CFA)のパターン。例えば普通のRGBフィルターだと、CFAPatternのデータは 02 02 00 01 01 02@ja"
    #voc/lstr
     "The color filter array (CFA) geometric pattern of the image sensor when a one-chip color area sensor is used. It does not apply to all sensing methods.@en"],
   :rdfs/label #voc/lstr "CFAPattern@en",
   :rdfs/subPropertyOf [:exif/pictTaking :exif/cfaPattern :exif/exifAttribute]})

(def colorSpace
  "The color space information tag (ColorSpace) is always recorded as the color space specifier. Normally sRGB (=1) is used to define the color space based on the PC monitor conditions and environment."
  {:db/ident :exif/colorSpace,
   :exif/tagNumber #voc/lstr "40961@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#voc/lstr "使われる色空間。通常sRGB@ja"
    #voc/lstr
     "The color space information tag (ColorSpace) is always recorded as the color space specifier. Normally sRGB (=1) is used to define the color space based on the PC monitor conditions and environment.@en"],
   :rdfs/label #voc/lstr "ColorSpace@en",
   :rdfs/subPropertyOf
   [:exif/imageDataCharacter :exif/colorSpace :exif/exifAttribute]})

(def componentsConfiguration
  "Information specific to compressed data. The channels of each component are arranged in order from the 1st component to the 4th. For uncompressed data the data arrangement is given in the PhotometricInterpretation tag. However, since PhotometricInterpretation can only express the order of Y,Cb and Cr, this tag is provided for cases when compressed data uses components other than Y, Cb, and Cr and to enable support of other sequences."
  {:db/ident :exif/componentsConfiguration,
   :exif/tagNumber #voc/lstr "37121@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#voc/lstr
     "圧縮データがYCC以外の並びの場合、4バイトでその並びを示す。それぞれの値は0:not exist,1:Y,2:Cb,3:Cr,4:R,5:G,6:B@ja"
    #voc/lstr
     "Information specific to compressed data. The channels of each component are arranged in order from the 1st component to the 4th. For uncompressed data the data arrangement is given in the PhotometricInterpretation tag. However, since PhotometricInterpretation can only express the order of Y,Cb and Cr, this tag is provided for cases when compressed data uses components other than Y, Cb, and Cr and to enable support of other sequences.@en"],
   :rdfs/label #voc/lstr "ComponentsConfiguration@en",
   :rdfs/subPropertyOf
   [:exif/imageConfig :exif/componentsConfiguration :exif/exifAttribute]})

(def compressedBitsPerPixel
  "Information specific to compressed data. The compression mode used for a compressed image is indicated in unit bits per pixel."
  {:db/ident :exif/compressedBitsPerPixel,
   :exif/tagNumber #voc/lstr "37122@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#voc/lstr "画像の圧縮率@ja"
    #voc/lstr
     "Information specific to compressed data. The compression mode used for a compressed image is indicated in unit bits per pixel.@en"],
   :rdfs/label #voc/lstr "CompressedBitsPerPixel@en",
   :rdfs/subPropertyOf
   [:exif/imageConfig :exif/compressedBitsPerPixel :exif/exifAttribute]})

(def compression
  "The compression scheme used for the image data. When a primary image is JPEG compressed, this designation is not necessary and is omitted. When thumbnails use JPEG compression, this tag value is set to 6."
  {:db/ident :exif/compression,
   :exif/tagNumber #voc/lstr "259@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "The compression scheme used for the image data. When a primary image is JPEG compressed, this designation is not necessary and is omitted. When thumbnails use JPEG compression, this tag value is set to 6.@en",
   :rdfs/label #voc/lstr "Compression@en",
   :rdfs/subPropertyOf
   [:exif/imageDataStruct :exif/compression :exif/exifAttribute]})

(def contrast
  "The direction of contrast processing applied by the camera when the image was shot."
  {:db/ident :exif/contrast,
   :exif/tagNumber #voc/lstr "41992@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "The direction of contrast processing applied by the camera when the image was shot.@en",
   :rdfs/label #voc/lstr "Contrast@en",
   :rdfs/subPropertyOf [:exif/pictTaking :exif/contrast :exif/exifAttribute]})

(def copyright
  "Copyright information. In this standard the tag is used to indicate both the photographer and editor copyrights. It is the copyright notice of the person or organization claiming rights to the image."
  {:db/ident :exif/copyright,
   :exif/tagNumber #voc/lstr "33432@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#voc/lstr "この画像の撮影者および編集者の著作権情報@ja"
    #voc/lstr
     "Copyright information. In this standard the tag is used to indicate both the photographer and editor copyrights. It is the copyright notice of the person or organization claiming rights to the image.@en"],
   :rdfs/label #voc/lstr "Copyright@en",
   :rdfs/subPropertyOf [:dc11/rights :exif/exifAttribute :exif/copyright]})

(def customRendered
  "The use of special processing on image data, such as rendering geared to output. When special processing is performed, the reader is expected to disable or minimize any further processing."
  {:db/ident :exif/customRendered,
   :exif/tagNumber #voc/lstr "41985@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#voc/lstr "特別なレンダリング処理を行っているかどうか@ja"
    #voc/lstr
     "The use of special processing on image data, such as rendering geared to output. When special processing is performed, the reader is expected to disable or minimize any further processing.@en"],
   :rdfs/label #voc/lstr "CustomRendered@en",
   :rdfs/subPropertyOf
   [:exif/pictTaking :exif/customRendered :exif/exifAttribute]})

(def datatype
  "The Exif field data type, such as ascii, byte, short etc."
  {:db/ident :exif/datatype,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr "The Exif field data type, such as ascii, byte, short etc.@en",
   :rdfs/label #voc/lstr "Data Type@en",
   :rdfs/subPropertyOf [:dc11/type :exif/datatype]})

(def date
  "a date information. Usually saved as YYYY:MM:DD (HH:MM:SS) format in Exif data, but represented here as W3C-DTF format"
  {:db/ident :exif/date,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "a date information. Usually saved as YYYY:MM:DD (HH:MM:SS) format in Exif data, but represented here as W3C-DTF format@en",
   :rdfs/label #voc/lstr "Date@en",
   :rdfs/subPropertyOf [:dc11/date :exif/date]})

(def dateAndOrTime
  "An attribute relating to Date and/or Time"
  {:db/ident           :exif/dateAndOrTime,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #voc/lstr "An attribute relating to Date and/or Time@en",
   :rdfs/label         #voc/lstr "Date and/or Time@en",
   :rdfs/subPropertyOf [:exif/exifAttribute :exif/dateAndOrTime]})

(def dateTime
  "The date and time of image creation. In this standard it is the date and time the file was changed."
  {:db/ident :exif/dateTime,
   :exif/tagNumber #voc/lstr "306@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#voc/lstr "この画像が作成（あるいは最後に変更された）日時。通常はDateTimeOriginaと同じ値@ja"
    #voc/lstr
     "The date and time of image creation. In this standard it is the date and time the file was changed.@en"],
   :rdfs/label #voc/lstr "DateTime@en",
   :rdfs/subPropertyOf
   [:exif/date :exif/exifAttribute :exif/dateTime :dc11/date]})

(def dateTimeDigitized
  "The date and time when the image was stored as digital data. If, for example, an image was captured by DSC and at the same time the file was recorded, then the DateTimeOriginal and DateTimeDigitized will have the same contents."
  {:db/ident :exif/dateTimeDigitized,
   :exif/tagNumber #voc/lstr "36868@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#voc/lstr "画像がデジタル化された日時。デジカメ画像なら通常DateTimeOriginalと同じ値@ja"
    #voc/lstr
     "The date and time when the image was stored as digital data. If, for example, an image was captured by DSC and at the same time the file was recorded, then the DateTimeOriginal and DateTimeDigitized will have the same contents.@en"],
   :rdfs/label #voc/lstr "DateTimeDigitized@en",
   :rdfs/subPropertyOf [:exif/date
                        :exif/dateAndOrTime
                        :exif/dateTimeDigitized
                        :exif/exifAttribute
                        :dc11/date]})

(def dateTimeOriginal
  "The date and time when the original image data was generated. For a DSC the date and time the picture was taken are recorded."
  {:db/ident :exif/dateTimeOriginal,
   :exif/tagNumber #voc/lstr "36867@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#voc/lstr "オリジナル画像が作成（撮影）された日時@ja"
    #voc/lstr
     "The date and time when the original image data was generated. For a DSC the date and time the picture was taken are recorded.@en"],
   :rdfs/label #voc/lstr "DateTimeOriginal@en",
   :rdfs/subPropertyOf [:exif/date
                        :exif/dateAndOrTime
                        :exif/dateTimeOriginal
                        :exif/exifAttribute
                        :dc11/date]})

(def deviceSettingDescription
  "Information on the picture-taking conditions of a particular camera model. The tag is used only to indicate the picture-taking conditions in the reader."
  {:db/ident :exif/deviceSettingDescription,
   :exif/tagNumber #voc/lstr "41995@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "Information on the picture-taking conditions of a particular camera model. The tag is used only to indicate the picture-taking conditions in the reader.@en",
   :rdfs/label #voc/lstr "DeviceSettingDescription@en",
   :rdfs/subPropertyOf
   [:exif/pictTaking :exif/deviceSettingDescription :exif/exifAttribute]})

(def digitalZoomRatio
  "The digital zoom ratio when the image was shot. If the numerator of the recorded value is 0, this indicates that digital zoom was not used."
  {:db/ident :exif/digitalZoomRatio,
   :exif/tagNumber #voc/lstr "41988@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#voc/lstr "デジタルズームが使われた場合、その比率@ja"
    #voc/lstr
     "The digital zoom ratio when the image was shot. If the numerator of the recorded value is 0, this indicates that digital zoom was not used.@en"],
   :rdfs/label #voc/lstr "DigitalZoomRatio@en",
   :rdfs/subPropertyOf
   [:exif/pictTaking :exif/digitalZoomRatio :exif/exifAttribute]})

(def exifAttribute
  "A property that connects an IFD to one of its entries. Super property which integrates all Exif tags."
  {:db/ident :exif/exifAttribute,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "A property that connects an IFD to one of its entries. Super property which integrates all Exif tags.@en",
   :rdfs/domain :exif/IFD,
   :rdfs/label #voc/lstr "Exif Attribute@en",
   :rdfs/subPropertyOf :exif/exifAttribute})

(def exifVersion
  "Exif Version"
  {:db/ident           :exif/exifVersion,
   :exif/tagNumber     #voc/lstr "36864@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       [#voc/lstr "Exif形式のバージョン@ja"
                        #voc/lstr "Exif Version@en"],
   :rdfs/label         #voc/lstr "ExifVersion@en",
   :rdfs/subPropertyOf [:exif/versionInfo
                        :exif/exifVersion
                        :exif/exifAttribute]})

(def exif_IFD_Pointer
  "A pointer to the Exif IFD, which is a set of tags for recording Exif-specific attribute information."
  {:db/ident :exif/exif_IFD_Pointer,
   :exif/tagNumber #voc/lstr "34665@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#voc/lstr "Exif IFDへのポインタ@ja"
    #voc/lstr
     "A pointer to the Exif IFD, which is a set of tags for recording Exif-specific attribute information.@en"],
   :rdfs/label #voc/lstr "Exif IFD Pointer@en",
   :rdfs/subPropertyOf
   [:exif/ifdPointer :exif/exif_IFD_Pointer :exif/exifAttribute]})

(def exifdata
  "An Exif IFD data entry"
  {:db/ident           :exif/exifdata,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #voc/lstr "An Exif IFD data entry@en",
   :rdfs/label         #voc/lstr "Exif data@en",
   :rdfs/subPropertyOf :exif/exifdata})

(def exposureBiasValue
  "The exposure bias. The unit is the APEX value. Ordinarily it is given in the range of -99.99 to 99.99."
  {:db/ident :exif/exposureBiasValue,
   :exif/tagNumber #voc/lstr "37380@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#voc/lstr "撮影時の露光補正量。単位はAPEX値(EV)@ja"
    #voc/lstr
     "The exposure bias. The unit is the APEX value. Ordinarily it is given in the range of -99.99 to 99.99.@en"],
   :rdfs/label #voc/lstr "ExposureBiasValue@en",
   :rdfs/subPropertyOf
   [:exif/pictTaking :exif/exposureBiasValue :exif/exifAttribute]})

(def exposureIndex
  "The exposure index selected on the camera or input device at the time the image is captured."
  {:db/ident :exif/exposureIndex,
   :exif/tagNumber #voc/lstr "41493@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#voc/lstr "CCD感度。データ形式が符号なし分数である事を除き、ISOSpeedRatingsと同じ@ja"
    #voc/lstr
     "The exposure index selected on the camera or input device at the time the image is captured.@en"],
   :rdfs/label #voc/lstr "ExposureIndex@en",
   :rdfs/subPropertyOf
   [:exif/pictTaking :exif/exposureIndex :exif/exifAttribute]})

(def exposureMode
  "the exposure mode set when the image was shot. In auto-bracketing mode, the camera shoots a series of frames of the same scene at different exposure settings."
  {:db/ident :exif/exposureMode,
   :exif/tagNumber #voc/lstr "41986@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#voc/lstr "露光モード@ja"
    #voc/lstr
     "the exposure mode set when the image was shot. In auto-bracketing mode, the camera shoots a series of frames of the same scene at different exposure settings.@en"],
   :rdfs/label #voc/lstr "ExposureMode@en",
   :rdfs/subPropertyOf
   [:exif/pictTaking :exif/exposureMode :exif/exifAttribute]})

(def exposureProgram
  "The class of the program used by the camera to set exposure when the picture is taken."
  {:db/ident :exif/exposureProgram,
   :exif/tagNumber #voc/lstr "34850@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#voc/lstr "露光制御のモード@ja"
    #voc/lstr
     "The class of the program used by the camera to set exposure when the picture is taken.@en"],
   :rdfs/label #voc/lstr "ExposureProgram@en",
   :rdfs/subPropertyOf
   [:exif/pictTaking :exif/exposureProgram :exif/exifAttribute]})

(def exposureTime
  "Exposure time, given in seconds (sec)."
  {:db/ident           :exif/exposureTime,
   :exif/tagNumber     #voc/lstr "33434@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       [#voc/lstr "露光時間（シャッター速度の逆数）。単位は秒@ja"
                        #voc/lstr "Exposure time, given in seconds (sec).@en"],
   :rdfs/label         #voc/lstr "ExposureTime@en",
   :rdfs/subPropertyOf [:exif/seconds
                        :exif/pictTaking
                        :exif/exposureTime
                        :exif/exifAttribute]})

(def fNumber
  "F number"
  {:db/ident           :exif/fNumber,
   :exif/tagNumber     #voc/lstr "33437@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       [#voc/lstr "レンズのF値@ja" #voc/lstr "F number@en"],
   :rdfs/label         #voc/lstr "FNumber@en",
   :rdfs/subPropertyOf [:exif/pictTaking :exif/fNumber :exif/exifAttribute]})

(def fileSource
  "The image source. If a DSC recorded the image, this tag value of this tag always be set to 3, indicating that the image was recorded on a DSC."
  {:db/ident :exif/fileSource,
   :exif/tagNumber #voc/lstr "41728@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#voc/lstr "画像がどういうデバイスから得られたか。通常3=DSC@ja"
    #voc/lstr
     "The image source. If a DSC recorded the image, this tag value of this tag always be set to 3, indicating that the image was recorded on a DSC.@en"],
   :rdfs/label #voc/lstr "FileSource@en",
   :rdfs/subPropertyOf [:exif/pictTaking :exif/fileSource :exif/exifAttribute]})

(def flash
  "The status of flash when the image was shot."
  {:db/ident           :exif/flash,
   :exif/tagNumber     #voc/lstr "37385@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       [#voc/lstr "フラッシュ発光の状態@ja"
                        #voc/lstr
                         "The status of flash when the image was shot.@en"],
   :rdfs/label         #voc/lstr "Flash@en",
   :rdfs/subPropertyOf [:exif/pictTaking :exif/flash :exif/exifAttribute]})

(def flashEnergy
  "The strobe energy at the time the image is captured, as measured in Beam Candle Power Seconds (BCPS)."
  {:db/ident :exif/flashEnergy,
   :exif/tagNumber #voc/lstr "41483@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#voc/lstr "BCPSによるストロボの強度@ja"
    #voc/lstr
     "The strobe energy at the time the image is captured, as measured in Beam Candle Power Seconds (BCPS).@en"],
   :rdfs/label #voc/lstr "FlashEnergy@en",
   :rdfs/subPropertyOf
   [:exif/pictTaking :exif/flashEnergy :exif/exifAttribute]})

(def flashpixVersion
  "The Flashpix format version supported by a FPXR file. If the FPXR function supports Flashpix format Ver. 1.0, this is indicated similarly to ExifVersion by recording \"0100\" as 4-byte ASCII."
  {:db/ident :exif/flashpixVersion,
   :exif/tagNumber #voc/lstr "40960@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "The Flashpix format version supported by a FPXR file. If the FPXR function supports Flashpix format Ver. 1.0, this is indicated similarly to ExifVersion by recording \"0100\" as 4-byte ASCII.@en",
   :rdfs/label #voc/lstr "FlashpixVersion@en",
   :rdfs/subPropertyOf
   [:exif/versionInfo :exif/flashpixVersion :exif/exifAttribute]})

(def focalLength
  "The actual focal length of the lens, in mm. Conversion is not made to the focal length of a 35 mm film camera."
  {:db/ident :exif/focalLength,
   :exif/tagNumber #voc/lstr "37386@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#voc/lstr "レンズの焦点距離。単位はmm@ja"
    #voc/lstr
     "The actual focal length of the lens, in mm. Conversion is not made to the focal length of a 35 mm film camera.@en"],
   :rdfs/label #voc/lstr "FocalLength@en",
   :rdfs/subPropertyOf [:exif/mm
                        :exif/pictTaking
                        :exif/focalLength
                        :exif/exifAttribute
                        :exif/length]})

(def focalLengthIn35mmFilm
  "The equivalent focal length assuming a 35mm film camera, in mm. A value of 0 means the focal length is unknown. Note that this tag differs from the FocalLength tag."
  {:db/ident :exif/focalLengthIn35mmFilm,
   :exif/tagNumber #voc/lstr "41989@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#voc/lstr "35mm換算した焦点距離@ja"
    #voc/lstr
     "The equivalent focal length assuming a 35mm film camera, in mm. A value of 0 means the focal length is unknown. Note that this tag differs from the FocalLength tag.@en"],
   :rdfs/label #voc/lstr "FocalLengthIn35mmFilm@en",
   :rdfs/subPropertyOf [:exif/length
                        :exif/pictTaking
                        :exif/focalLengthIn35mmFilm
                        :exif/exifAttribute]})

(def focalPlaneResolutionUnit
  "The unit for measuring FocalPlaneXResolution and FocalPlaneYResolution. This value is the same as the ResolutionUnit."
  {:db/ident :exif/focalPlaneResolutionUnit,
   :exif/tagNumber #voc/lstr "41488@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#voc/lstr "CCD画素密度の単位@ja"
    #voc/lstr
     "The unit for measuring FocalPlaneXResolution and FocalPlaneYResolution. This value is the same as the ResolutionUnit.@en"],
   :rdfs/label #voc/lstr "FocalPlaneResolutionUnit@en",
   :rdfs/subPropertyOf
   [:exif/pictTaking :exif/focalPlaneResolutionUnit :exif/exifAttribute]})

(def focalPlaneXResolution
  "The number of pixels in the image width (X) direction per FocalPlaneResolutionUnit on the camera focal plane."
  {:db/ident :exif/focalPlaneXResolution,
   :exif/tagNumber #voc/lstr "41486@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#voc/lstr
     "撮影画像のCCD位置での水平解像度。この値とFocalPlaneYResolution、FocalLengthを使うと、レンズ焦点距離の35mmカメラ換算値が計算できる。例えば200万画素機を使いVGAモードの画像を撮ったような場合はこの値はVGAの解像度でリサンプルされた値になっており、CCDの画素ピッチそのままの値ではないので注意が必要@ja"
    #voc/lstr
     "The number of pixels in the image width (X) direction per FocalPlaneResolutionUnit on the camera focal plane.@en"],
   :rdfs/label #voc/lstr "FocalPlaneXResolution@en",
   :rdfs/subPropertyOf [:exif/resolution
                        :exif/pictTaking
                        :exif/focalPlaneXResolution
                        :exif/exifAttribute]})

(def focalPlaneYResolution
  "The number of pixels in the image height (Y) direction per FocalPlaneResolutionUnit on the camera focal plane."
  {:db/ident :exif/focalPlaneYResolution,
   :exif/tagNumber #voc/lstr "41487@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#voc/lstr "撮影画像のCCD位置での垂直解像度@ja"
    #voc/lstr
     "The number of pixels in the image height (Y) direction per FocalPlaneResolutionUnit on the camera focal plane.@en"],
   :rdfs/label #voc/lstr "FocalPlaneYResolution@en",
   :rdfs/subPropertyOf [:exif/resolution
                        :exif/pictTaking
                        :exif/focalPlaneYResolution
                        :exif/exifAttribute]})

(def gainControl
  "The degree of overall image gain adjustment."
  {:db/ident           :exif/gainControl,
   :exif/tagNumber     #voc/lstr "41991@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       #voc/lstr
                        "The degree of overall image gain adjustment.@en",
   :rdfs/label         #voc/lstr "GainControl@en",
   :rdfs/subPropertyOf [:exif/pictTaking
                        :exif/gainControl
                        :exif/exifAttribute]})

(def geo
  "Geometric data such as latitude, longitude and altitude. Usually saved as rational number."
  {:db/ident :exif/geo,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "Geometric data such as latitude, longitude and altitude. Usually saved as rational number.@en",
   :rdfs/label #voc/lstr "Geometric data@en",
   :rdfs/subPropertyOf :exif/geo})

(def gpsAltitude
  "The altitude based on the reference in GPSAltitudeRef. Altitude is expressed as one RATIONAL value. The reference unit is meters."
  {:db/ident :exif/gpsAltitude,
   :exif/tagNumber #voc/lstr "6@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "The altitude based on the reference in GPSAltitudeRef. Altitude is expressed as one RATIONAL value. The reference unit is meters.@en",
   :rdfs/label #voc/lstr "GPSAltitude@en",
   :rdfs/subPropertyOf
   [:exif/geo :exif/gpsInfo :exif/gpsAltitude :exif/exifAttribute]})

(def gpsAltitudeRef
  "Indicates the altitude used as the reference altitude. If the reference is sea level and the altitude is above sea level, 0 is given. If the altitude is below sea level, a value of 1 is given and the altitude is indicated as an absolute value in the GPSAltitude tag. The reference unit is meters."
  {:db/ident :exif/gpsAltitudeRef,
   :exif/tagNumber #voc/lstr "5@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "Indicates the altitude used as the reference altitude. If the reference is sea level and the altitude is above sea level, 0 is given. If the altitude is below sea level, a value of 1 is given and the altitude is indicated as an absolute value in the GPSAltitude tag. The reference unit is meters.@en",
   :rdfs/label #voc/lstr "GPSAltitudeRef@en",
   :rdfs/subPropertyOf
   [:exif/gpsInfo :exif/gpsAltitudeRef :exif/exifAttribute]})

(def gpsAreaInformation
  "A character string recording the name of the GPS area. The first byte indicates the character code used, and this is followed by the name of the GPS area."
  {:db/ident :exif/gpsAreaInformation,
   :exif/tagNumber #voc/lstr "28@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "A character string recording the name of the GPS area. The first byte indicates the character code used, and this is followed by the name of the GPS area.@en",
   :rdfs/label #voc/lstr "GPSAreaInformation@en",
   :rdfs/subPropertyOf
   [:exif/gpsInfo :exif/gpsAreaInformation :exif/exifAttribute]})

(def gpsDOP
  "The GPS DOP (data degree of precision). An HDOP value is written during two-dimensional measurement, and PDOP during three-dimensional measurement."
  {:db/ident :exif/gpsDOP,
   :exif/tagNumber #voc/lstr "11@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "The GPS DOP (data degree of precision). An HDOP value is written during two-dimensional measurement, and PDOP during three-dimensional measurement.@en",
   :rdfs/label #voc/lstr "GPSDOP@en",
   :rdfs/subPropertyOf [:exif/gpsInfo :exif/gpsDOP :exif/exifAttribute]})

(def gpsDateStamp
  "date and time information relative to UTC (Coordinated Universal Time). The record format is \"YYYY:MM:DD\" while converted to W3C-DTF to use in RDF"
  {:db/ident :exif/gpsDateStamp,
   :exif/tagNumber #voc/lstr "29@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "date and time information relative to UTC (Coordinated Universal Time). The record format is \"YYYY:MM:DD\" while converted to W3C-DTF to use in RDF@en",
   :rdfs/label #voc/lstr "GPSDateStamp@en",
   :rdfs/subPropertyOf [:exif/date
                        :exif/gpsInfo
                        :exif/gpsDateStamp
                        :exif/exifAttribute
                        :dc11/date]})

(def gpsDestBearing
  "The bearing to the destination point. The range of values is from 0.00 to 359.99."
  {:db/ident :exif/gpsDestBearing,
   :exif/tagNumber #voc/lstr "24@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "The bearing to the destination point. The range of values is from 0.00 to 359.99.@en",
   :rdfs/label #voc/lstr "GPSDestBearing@en",
   :rdfs/subPropertyOf
   [:exif/gpsInfo :exif/gpsDestBearing :exif/exifAttribute]})

(def gpsDestBearingRef
  "Indicates the reference used for giving the bearing to the destination point. 'T' denotes true direction and 'M' is magnetic direction."
  {:db/ident :exif/gpsDestBearingRef,
   :exif/tagNumber #voc/lstr "23@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "Indicates the reference used for giving the bearing to the destination point. 'T' denotes true direction and 'M' is magnetic direction.@en",
   :rdfs/label #voc/lstr "GPSDestBearingRef@en",
   :rdfs/subPropertyOf
   [:exif/gpsInfo :exif/gpsDestBearingRef :exif/exifAttribute]})

(def gpsDestDistance
  "The distance to the destination point."
  {:db/ident           :exif/gpsDestDistance,
   :exif/tagNumber     #voc/lstr "26@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       #voc/lstr "The distance to the destination point.@en",
   :rdfs/label         #voc/lstr "GPSDestDistance@en",
   :rdfs/subPropertyOf [:exif/gpsInfo
                        :exif/gpsDestDistance
                        :exif/exifAttribute]})

(def gpsDestDistanceRef
  "Indicates the unit used to express the distance to the destination point. 'K', 'M' and 'N' represent kilometers, miles and knots."
  {:db/ident :exif/gpsDestDistanceRef,
   :exif/tagNumber #voc/lstr "25@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "Indicates the unit used to express the distance to the destination point. 'K', 'M' and 'N' represent kilometers, miles and knots.@en",
   :rdfs/label #voc/lstr "GPSDestDistanceRef@en",
   :rdfs/subPropertyOf
   [:exif/gpsInfo :exif/gpsDestDistanceRef :exif/exifAttribute]})

(def gpsDestLatitude
  "Latitude of destination, expressed as three values giving the degrees, minutes, and seconds, respectively."
  {:db/ident :exif/gpsDestLatitude,
   :exif/tagNumber #voc/lstr "20@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "Latitude of destination, expressed as three values giving the degrees, minutes, and seconds, respectively.@en",
   :rdfs/label #voc/lstr "GPSDestLatitude@en",
   :rdfs/subPropertyOf
   [:exif/geo :exif/gpsInfo :exif/gpsDestLatitude :exif/exifAttribute]})

(def gpsDestLatitudeRef
  "Reference for latitude of destination"
  {:db/ident           :exif/gpsDestLatitudeRef,
   :exif/tagNumber     #voc/lstr "19@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       #voc/lstr "Reference for latitude of destination@en",
   :rdfs/label         #voc/lstr "GPSDestLatitudeRef@en",
   :rdfs/subPropertyOf [:exif/gpsInfo
                        :exif/gpsDestLatitudeRef
                        :exif/exifAttribute]})

(def gpsDestLongitude
  "Longitude of destination, expressed as three values giving the degrees, minutes, and seconds, respectively."
  {:db/ident :exif/gpsDestLongitude,
   :exif/tagNumber #voc/lstr "22@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "Longitude of destination, expressed as three values giving the degrees, minutes, and seconds, respectively.@en",
   :rdfs/label #voc/lstr "GPSDestLongitude@en",
   :rdfs/subPropertyOf
   [:exif/geo :exif/gpsInfo :exif/gpsDestLongitude :exif/exifAttribute]})

(def gpsDestLongitudeRef
  "Reference for longitude of destination"
  {:db/ident           :exif/gpsDestLongitudeRef,
   :exif/tagNumber     #voc/lstr "21@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       #voc/lstr "Reference for longitude of destination@en",
   :rdfs/label         #voc/lstr "GPSDestLongitudeRef@en",
   :rdfs/subPropertyOf [:exif/gpsInfo
                        :exif/gpsDestLongitudeRef
                        :exif/exifAttribute]})

(def gpsDifferential
  "Indicates whether differential correction is applied to the GPS receiver."
  {:db/ident :exif/gpsDifferential,
   :exif/tagNumber #voc/lstr "30@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "Indicates whether differential correction is applied to the GPS receiver.@en",
   :rdfs/label #voc/lstr "GPSDifferential@en",
   :rdfs/subPropertyOf
   [:exif/gpsInfo :exif/gpsDifferential :exif/exifAttribute]})

(def gpsImgDirection
  "The direction of the image when it was captured. The range of values is from 0.00 to 359.99."
  {:db/ident :exif/gpsImgDirection,
   :exif/tagNumber #voc/lstr "17@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "The direction of the image when it was captured. The range of values is from 0.00 to 359.99.@en",
   :rdfs/label #voc/lstr "GPSImgDirection@en",
   :rdfs/subPropertyOf
   [:exif/gpsInfo :exif/gpsImgDirection :exif/exifAttribute]})

(def gpsImgDirectionRef
  "The reference for giving the direction of the image when it is captured. 'T' denotes true direction and 'M' is magnetic direction."
  {:db/ident :exif/gpsImgDirectionRef,
   :exif/tagNumber #voc/lstr "16@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "The reference for giving the direction of the image when it is captured. 'T' denotes true direction and 'M' is magnetic direction.@en",
   :rdfs/label #voc/lstr "GPSImgDirectionRef@en",
   :rdfs/subPropertyOf
   [:exif/gpsInfo :exif/gpsImgDirectionRef :exif/exifAttribute]})

(def gpsInfo
  "An attribute relating to GPS information"
  {:db/ident           :exif/gpsInfo,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #voc/lstr "An attribute relating to GPS information@en",
   :rdfs/label         #voc/lstr "GPS Info@en",
   :rdfs/subPropertyOf [:exif/exifAttribute :exif/gpsInfo]})

(def gpsInfo_IFD_Pointer
  "A pointer to the GPS IFD, which is a set of tags for recording GPS information."
  {:db/ident :exif/gpsInfo_IFD_Pointer,
   :exif/tagNumber #voc/lstr "34853@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#voc/lstr "GPS IFDへのポインタ@ja"
    #voc/lstr
     "A pointer to the GPS IFD, which is a set of tags for recording GPS information.@en"],
   :rdfs/label #voc/lstr "GPSInfo IFD Pointer@en",
   :rdfs/subPropertyOf
   [:exif/ifdPointer :exif/gpsInfo_IFD_Pointer :exif/exifAttribute]})

(def gpsLatitude
  "The latitude, expressed as three values giving the degrees, minutes, and seconds, respectively."
  {:db/ident :exif/gpsLatitude,
   :exif/tagNumber #voc/lstr "2@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#voc/lstr "緯度@ja"
    #voc/lstr
     "The latitude, expressed as three values giving the degrees, minutes, and seconds, respectively.@en"],
   :rdfs/label #voc/lstr "GPSLatitude@en",
   :rdfs/subPropertyOf
   [:exif/geo :exif/gpsInfo :exif/gpsLatitude :exif/exifAttribute]})

(def gpsLatitudeRef
  "Indicates whether the latitude is north or south latitude. The ASCII value 'N' indicates north latitude, and 'S' is south latitude."
  {:db/ident :exif/gpsLatitudeRef,
   :exif/tagNumber #voc/lstr "1@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#voc/lstr "緯度の北緯もしくは南緯@ja"
    #voc/lstr
     "Indicates whether the latitude is north or south latitude. The ASCII value 'N' indicates north latitude, and 'S' is south latitude.@en"],
   :rdfs/label #voc/lstr "GPSLatitudeRef@en",
   :rdfs/subPropertyOf
   [:exif/gpsInfo :exif/gpsLatitudeRef :exif/exifAttribute]})

(def gpsLongitude
  "The longitude, expressed as three values giving the degrees, minutes, and seconds, respectively."
  {:db/ident :exif/gpsLongitude,
   :exif/tagNumber #voc/lstr "4@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#voc/lstr "経度@ja"
    #voc/lstr
     "The longitude, expressed as three values giving the degrees, minutes, and seconds, respectively.@en"],
   :rdfs/label #voc/lstr "GPSLongitude@en",
   :rdfs/subPropertyOf
   [:exif/geo :exif/gpsInfo :exif/gpsLongitude :exif/exifAttribute]})

(def gpsLongitudeRef
  "Indicates whether the longitude is east or west longitude. ASCII 'E' indicates east longitude, and 'W' is west longitude."
  {:db/ident :exif/gpsLongitudeRef,
   :exif/tagNumber #voc/lstr "3@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#voc/lstr "経度の東経もしくは西経@ja"
    #voc/lstr
     "Indicates whether the longitude is east or west longitude. ASCII 'E' indicates east longitude, and 'W' is west longitude.@en"],
   :rdfs/label #voc/lstr "GPSLongitudeRef@en",
   :rdfs/subPropertyOf
   [:exif/gpsInfo :exif/gpsLongitudeRef :exif/exifAttribute]})

(def gpsMapDatum
  "The geodetic survey data used by the GPS receiver. If the survey data is restricted to Japan, the value of this tag is 'TOKYO' or 'WGS-84'. If a GPS Info tag is recorded, it is strongly recommended that this tag be recorded."
  {:db/ident :exif/gpsMapDatum,
   :exif/tagNumber #voc/lstr "18@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#voc/lstr "測地系。日本なら'TOKYO'もしくは'WGS-84'@ja"
    #voc/lstr
     "The geodetic survey data used by the GPS receiver. If the survey data is restricted to Japan, the value of this tag is 'TOKYO' or 'WGS-84'. If a GPS Info tag is recorded, it is strongly recommended that this tag be recorded.@en"],
   :rdfs/label #voc/lstr "GPSMapDatum@en",
   :rdfs/subPropertyOf [:exif/gpsInfo :exif/gpsMapDatum :exif/exifAttribute]})

(def gpsMeasureMode
  "The GPS measurement mode. '2' means two-dimensional measurement and '3' means three-dimensional measurement is in progress."
  {:db/ident :exif/gpsMeasureMode,
   :exif/tagNumber #voc/lstr "10@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "The GPS measurement mode. '2' means two-dimensional measurement and '3' means three-dimensional measurement is in progress.@en",
   :rdfs/label #voc/lstr "GPSMeasureMode@en",
   :rdfs/subPropertyOf
   [:exif/gpsInfo :exif/gpsMeasureMode :exif/exifAttribute]})

(def gpsProcessingMethod
  "A character string recording the name of the method used for location finding. The first byte indicates the character code used, and this is followed by the name of the method."
  {:db/ident :exif/gpsProcessingMethod,
   :exif/tagNumber #voc/lstr "27@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "A character string recording the name of the method used for location finding. The first byte indicates the character code used, and this is followed by the name of the method.@en",
   :rdfs/label #voc/lstr "GPSProcessingMethod@en",
   :rdfs/subPropertyOf
   [:exif/gpsInfo :exif/gpsProcessingMethod :exif/exifAttribute]})

(def gpsSatellites
  "The GPS satellites used for measurements. This tag can be used to describe the number of satellites, their ID number, angle of elevation, azimuth, SNR and other information in ASCII notation. The format is not specified. If the GPS receiver is incapable of taking measurements, value of the tag shall be set to NULL."
  {:db/ident :exif/gpsSatellites,
   :exif/tagNumber #voc/lstr "8@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "The GPS satellites used for measurements. This tag can be used to describe the number of satellites, their ID number, angle of elevation, azimuth, SNR and other information in ASCII notation. The format is not specified. If the GPS receiver is incapable of taking measurements, value of the tag shall be set to NULL.@en",
   :rdfs/label #voc/lstr "GPSSatellites@en",
   :rdfs/subPropertyOf [:exif/gpsInfo :exif/gpsSatellites :exif/exifAttribute]})

(def gpsSpeed
  "The speed of GPS receiver movement."
  {:db/ident           :exif/gpsSpeed,
   :exif/tagNumber     #voc/lstr "13@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       #voc/lstr "The speed of GPS receiver movement.@en",
   :rdfs/label         #voc/lstr "GPSSpeed@en",
   :rdfs/subPropertyOf [:exif/gpsInfo :exif/gpsSpeed :exif/exifAttribute]})

(def gpsSpeedRef
  "The unit used to express the GPS receiver speed of movement. 'K' 'M' and 'N' represents kilometers per hour, miles per hour, and knots."
  {:db/ident :exif/gpsSpeedRef,
   :exif/tagNumber #voc/lstr "12@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "The unit used to express the GPS receiver speed of movement. 'K' 'M' and 'N' represents kilometers per hour, miles per hour, and knots.@en",
   :rdfs/label #voc/lstr "GPSSpeedRef@en",
   :rdfs/subPropertyOf [:exif/gpsInfo :exif/gpsSpeedRef :exif/exifAttribute]})

(def gpsStatus
  "The status of the GPS receiver when the image is recorded. 'A' means measurement is in progress, and 'V' means the measurement is Interoperability."
  {:db/ident :exif/gpsStatus,
   :exif/tagNumber #voc/lstr "9@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "The status of the GPS receiver when the image is recorded. 'A' means measurement is in progress, and 'V' means the measurement is Interoperability.@en",
   :rdfs/label #voc/lstr "GPSStatus@en",
   :rdfs/subPropertyOf [:exif/gpsInfo :exif/gpsStatus :exif/exifAttribute]})

(def gpsTimeStamp
  "The time as UTC (Coordinated Universal Time). TimeStamp is expressed as three RATIONAL values giving the hour, minute, and second."
  {:db/ident :exif/gpsTimeStamp,
   :exif/tagNumber #voc/lstr "7@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "The time as UTC (Coordinated Universal Time). TimeStamp is expressed as three RATIONAL values giving the hour, minute, and second.@en",
   :rdfs/label #voc/lstr "GPSTimeStamp@en",
   :rdfs/subPropertyOf [:exif/gpsInfo :exif/gpsTimeStamp :exif/exifAttribute]})

(def gpsTrack
  "The direction of GPS receiver movement. The range of values is from 0.00 to 359.99."
  {:db/ident :exif/gpsTrack,
   :exif/tagNumber #voc/lstr "15@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "The direction of GPS receiver movement. The range of values is from 0.00 to 359.99.@en",
   :rdfs/label #voc/lstr "GPSTrack@en",
   :rdfs/subPropertyOf [:exif/gpsInfo :exif/gpsTrack :exif/exifAttribute]})

(def gpsTrackRef
  "The reference for giving the direction of GPS receiver movement. 'T' denotes true direction and 'M' is magnetic direction."
  {:db/ident :exif/gpsTrackRef,
   :exif/tagNumber #voc/lstr "14@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "The reference for giving the direction of GPS receiver movement. 'T' denotes true direction and 'M' is magnetic direction.@en",
   :rdfs/label #voc/lstr "GPSTrackRef@en",
   :rdfs/subPropertyOf [:exif/gpsInfo :exif/gpsTrackRef :exif/exifAttribute]})

(def gpsVersionID
  "The version of GPSInfoIFD. The version is given as 2.2.0.0. This tag is mandatory when GPSInfo tag is present."
  {:db/ident :exif/gpsVersionID,
   :exif/tagNumber #voc/lstr "0@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "The version of GPSInfoIFD. The version is given as 2.2.0.0. This tag is mandatory when GPSInfo tag is present.@en",
   :rdfs/label #voc/lstr "GPSVersionID@en",
   :rdfs/subPropertyOf
   [:exif/versionInfo :exif/gpsInfo :exif/gpsVersionID :exif/exifAttribute]})

(def height
  "Height of an object"
  {:db/ident           :exif/height,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #voc/lstr "Height of an object@en",
   :rdfs/label         #voc/lstr "Height@en",
   :rdfs/subPropertyOf [:exif/length :exif/height]})

(def ifdPointer
  "A tag that refers a child IFD"
  {:db/ident           :exif/ifdPointer,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #voc/lstr "A tag that refers a child IFD@en",
   :rdfs/label         #voc/lstr "IFD Pointer@en",
   :rdfs/subPropertyOf [:exif/exifAttribute :exif/ifdPointer]})

(def imageConfig
  "An attribute relating to Image Configuration"
  {:db/ident           :exif/imageConfig,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #voc/lstr
                        "An attribute relating to Image Configuration@en",
   :rdfs/label         #voc/lstr "Image Config@en",
   :rdfs/subPropertyOf [:exif/exifAttribute :exif/imageConfig]})

(def imageDataCharacter
  "An attribute relating to image data characteristics"
  {:db/ident :exif/imageDataCharacter,
   :rdf/type :rdf/Property,
   :rdfs/comment #voc/lstr
                  "An attribute relating to image data characteristics@en",
   :rdfs/label #voc/lstr "Image Data Character@en",
   :rdfs/subPropertyOf [:exif/exifAttribute :exif/imageDataCharacter]})

(def imageDataStruct
  "An attribute relating to image data structure"
  {:db/ident           :exif/imageDataStruct,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #voc/lstr
                        "An attribute relating to image data structure@en",
   :rdfs/label         #voc/lstr "Image Data Structure@en",
   :rdfs/subPropertyOf [:exif/exifAttribute :exif/imageDataStruct]})

(def imageDescription
  "A character string giving the title of the image. It may be a comment such as \"1988 company picnic\" or the like. Two-byte character codes cannot be used. When a 2-byte code is necessary, the Exif Private tag UserComment is to be used."
  {:db/ident :exif/imageDescription,
   :exif/tagNumber #voc/lstr "270@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#voc/lstr "この画像についての説明。漢字等の2バイト文字の使用は禁止@ja"
    #voc/lstr
     "A character string giving the title of the image. It may be a comment such as \"1988 company picnic\" or the like. Two-byte character codes cannot be used. When a 2-byte code is necessary, the Exif Private tag UserComment is to be used.@en"],
   :rdfs/label #voc/lstr "ImageDescription@en",
   :rdfs/subPropertyOf
   [:dc11/title :exif/exifAttribute :exif/imageDescription]})

(def imageLength
  "Image height. The number of rows of image data. In JPEG compressed data a JPEG marker is used."
  {:db/ident :exif/imageLength,
   :exif/tagNumber #voc/lstr "257@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "Image height. The number of rows of image data. In JPEG compressed data a JPEG marker is used.@en",
   :rdfs/label #voc/lstr "ImageLength@en",
   :rdfs/subPropertyOf [:exif/height
                        :exif/imageDataStruct
                        :exif/imageLength
                        :exif/exifAttribute
                        :exif/length]})

(def imageUniqueID
  "An identifier assigned uniquely to each image. It is recorded as an ASCII string equivalent to hexadecimal notation and 128-bit fixed length."
  {:db/ident :exif/imageUniqueID,
   :exif/tagNumber #voc/lstr "42016@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "An identifier assigned uniquely to each image. It is recorded as an ASCII string equivalent to hexadecimal notation and 128-bit fixed length.@en",
   :rdfs/label #voc/lstr "ImageUniqueID@en",
   :rdfs/subPropertyOf
   [:dc11/identifier :exif/exifAttribute :exif/imageUniqueID]})

(def imageWidth
  "Image width. The number of columns of image data, equal to the number of pixels per row. In JPEG compressed data a JPEG marker is used instead of this tag."
  {:db/ident :exif/imageWidth,
   :exif/tagNumber #voc/lstr "256@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "Image width. The number of columns of image data, equal to the number of pixels per row. In JPEG compressed data a JPEG marker is used instead of this tag.@en",
   :rdfs/label #voc/lstr "ImageWidth@en",
   :rdfs/subPropertyOf [:exif/width
                        :exif/imageDataStruct
                        :exif/imageWidth
                        :exif/exifAttribute
                        :exif/length]})

(def interopInfo
  "An attribute relating to Interoperability. Tags stored in Interoperability IFD may be defined dependently to each Interoperability rule."
  {:db/ident :exif/interopInfo,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "An attribute relating to Interoperability. Tags stored in\nInteroperability IFD may be defined dependently to each Interoperability rule.@en",
   :rdfs/label #voc/lstr "Interoperability Info@en",
   :rdfs/subPropertyOf [:exif/exifAttribute :exif/interopInfo]})

(def interoperabilityIndex
  "Indicates the identification of the Interoperability rule. 'R98' = conforming to R98 file specification of Recommended Exif Interoperability Rules (ExifR98) or to DCF basic file stipulated by Design Rule for Camera File System. 'THM' = conforming to DCF thumbnail file stipulated by Design rule for Camera File System."
  {:db/ident :exif/interoperabilityIndex,
   :exif/tagNumber #voc/lstr "1@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#voc/lstr
     "メイン画像のInteroperability IFDで、データの内容がExifR98 v1.0準拠の場合は、'R98'の文字列。サムネィル画像のInteroperability IFDの場合は、'THM'の文字列@ja"
    #voc/lstr
     "Indicates the identification of the Interoperability rule. 'R98' = conforming to R98 file specification of Recommended Exif Interoperability Rules (ExifR98) or to DCF basic file stipulated by Design Rule for Camera File System. 'THM' = conforming to DCF thumbnail file stipulated by Design rule for Camera File System.@en"],
   :rdfs/label #voc/lstr "InteroperabilityIndex@en",
   :rdfs/subPropertyOf
   [:exif/interopInfo :exif/interoperabilityIndex :exif/exifAttribute]})

(def interoperabilityVersion
  "Interoperability Version"
  {:db/ident           :exif/interoperabilityVersion,
   :exif/tagNumber     #voc/lstr "2@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       [#voc/lstr "データの内容がExifR98 v1.0準拠の場合は、'0100'の文字列。@ja"
                        #voc/lstr "Interoperability Version@en"],
   :rdfs/label         #voc/lstr "InteroperabilityVersion@en",
   :rdfs/subPropertyOf [:exif/interopInfo
                        :exif/interoperabilityVersion
                        :exif/exifAttribute]})

(def interoperability_IFD_Pointer
  "A pointer to the Interoperability IFD, which is composed of tags storing the information to ensure the Interoperability"
  {:db/ident :exif/interoperability_IFD_Pointer,
   :exif/tagNumber #voc/lstr "40965@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#voc/lstr "Interoperability IFDへのポインタ@ja"
    #voc/lstr
     "A pointer to the Interoperability IFD, which is composed of tags storing the information to ensure the Interoperability@en"],
   :rdfs/label #voc/lstr "Interoperability IFD Pointer@en",
   :rdfs/subPropertyOf
   [:exif/ifdPointer :exif/interoperability_IFD_Pointer :exif/exifAttribute]})

(def isoSpeedRatings
  "Indicates the ISO Speed and ISO Latitude of the camera or input device as specified in ISO 12232."
  {:db/ident :exif/isoSpeedRatings,
   :exif/tagNumber #voc/lstr "34855@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#voc/lstr "CCD感度の銀塩フィルム換算値@ja"
    #voc/lstr
     "Indicates the ISO Speed and ISO Latitude of the camera or input device as specified in ISO 12232.@en"],
   :rdfs/label #voc/lstr "ISOSpeedRatings@en",
   :rdfs/subPropertyOf
   [:exif/pictTaking :exif/isoSpeedRatings :exif/exifAttribute]})

(def jpegInterchangeFormat
  "The offset to the start byte (SOI) of JPEG compressed thumbnail data. This is not used for primary image JPEG data."
  {:db/ident :exif/jpegInterchangeFormat,
   :exif/tagNumber #voc/lstr "513@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#voc/lstr "圧縮されたサムネイルへのオフセット@ja"
    #voc/lstr
     "The offset to the start byte (SOI) of JPEG compressed thumbnail data. This is not used for primary image JPEG data.@en"],
   :rdfs/label #voc/lstr "JPEGInterchangeFormat@en",
   :rdfs/subPropertyOf
   [:exif/recOffset :exif/jpegInterchangeFormat :exif/exifAttribute]})

(def jpegInterchangeFormatLength
  "The number of bytes of JPEG compressed thumbnail data. This is not used for primary image JPEG data."
  {:db/ident :exif/jpegInterchangeFormatLength,
   :exif/tagNumber #voc/lstr "514@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#voc/lstr "圧縮されたサムネイルのサイズ@ja"
    #voc/lstr
     "The number of bytes of JPEG compressed thumbnail data. This is not used for primary image JPEG data.@en"],
   :rdfs/label #voc/lstr "JPEGInterchangeFormatLength@en",
   :rdfs/subPropertyOf
   [:exif/recOffset :exif/jpegInterchangeFormatLength :exif/exifAttribute]})

(def length
  "Length of an object. Could be a subProperty of other general schema."
  {:db/ident :exif/length,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "Length of an object. Could be a subProperty of other general schema.@en",
   :rdfs/label #voc/lstr "Length@en",
   :rdfs/subPropertyOf :exif/length})

(def lightSource
  "Light source such as Daylight, Tungsten, Flash etc."
  {:db/ident :exif/lightSource,
   :exif/tagNumber #voc/lstr "37384@en",
   :rdf/type :rdf/Property,
   :rdfs/comment [#voc/lstr "光源。これはマニュアルでホワイトバランスを設定した場合のモード値となる@ja"
                  #voc/lstr
                   "Light source such as Daylight, Tungsten, Flash etc.@en"],
   :rdfs/label #voc/lstr "LightSource@en",
   :rdfs/subPropertyOf
   [:exif/pictTaking :exif/lightSource :exif/exifAttribute]})

(def make
  "Manufacturer of image input equipment"
  {:db/ident           :exif/make,
   :exif/tagNumber     #voc/lstr "271@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       [#voc/lstr "カメラのメーカー名。DCFでは必須@ja"
                        #voc/lstr "Manufacturer of image input equipment@en"],
   :rdfs/label         #voc/lstr "Make@en",
   :rdfs/subPropertyOf [:rdfs/label :exif/exifAttribute :exif/make]})

(def makerNote
  "Manufacturer notes"
  {:db/ident           :exif/makerNote,
   :exif/tagNumber     #voc/lstr "37500@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       [#voc/lstr "カメラの内部情報等、メーカー依存データ@ja"
                        #voc/lstr "Manufacturer notes@en"],
   :rdfs/label         #voc/lstr "MakerNote@en",
   :rdfs/subPropertyOf [:exif/userInfo :exif/makerNote :exif/exifAttribute]})

(def maxApertureValue
  "The smallest F number of the lens. The unit is the APEX value. Ordinarily it is given in the range of 00.00 to 99.99, but it is not limited to this range."
  {:db/ident :exif/maxApertureValue,
   :exif/tagNumber #voc/lstr "37381@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#voc/lstr "レンズの開放F値。ApertureValue同様、ルート2のベキ乗を取ると通常の絞り値に換算できる@ja"
    #voc/lstr
     "The smallest F number of the lens. The unit is the APEX value. Ordinarily it is given in the range of 00.00 to 99.99, but it is not limited to this range.@en"],
   :rdfs/label #voc/lstr "MaxApertureValue@en",
   :rdfs/subPropertyOf
   [:exif/pictTaking :exif/maxApertureValue :exif/exifAttribute]})

(def meter
  "A length with unit of meter"
  {:db/ident           :exif/meter,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #voc/lstr "A length with unit of meter@en",
   :rdfs/label         #voc/lstr "Meter@en",
   :rdfs/subPropertyOf [:exif/length :exif/meter]})

(def meteringMode
  "Metering mode, such as CenterWeightedAverage, Spot, MultiSpot,Pattern, Partial etc."
  {:db/ident :exif/meteringMode,
   :exif/tagNumber #voc/lstr "37383@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#voc/lstr "自動露出の測光モード@ja"
    #voc/lstr
     "Metering mode, such as CenterWeightedAverage, Spot, MultiSpot,Pattern, Partial etc.@en"],
   :rdfs/label #voc/lstr "MeteringMode@en",
   :rdfs/subPropertyOf
   [:exif/pictTaking :exif/meteringMode :exif/exifAttribute]})

(def mm
  "A length with unit of mm"
  {:db/ident           :exif/mm,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #voc/lstr "A length with unit of mm@en",
   :rdfs/label         #voc/lstr "Milimeter@en",
   :rdfs/subPropertyOf [:exif/length :exif/mm]})

(def model
  "Model of image input equipment"
  {:db/ident           :exif/model,
   :exif/tagNumber     #voc/lstr "272@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       [#voc/lstr "カメラの機種名。DCFでは必須@ja"
                        #voc/lstr "Model of image input equipment@en"],
   :rdfs/label         #voc/lstr "Model@en",
   :rdfs/subPropertyOf [:rdfs/label :exif/exifAttribute :exif/model]})

(def oecf
  "Indicates the Opto-Electric Conversion Function (OECF) specified in ISO 14524. OECF is the relationship between the camera optical input and the image values."
  {:db/ident :exif/oecf,
   :exif/tagNumber #voc/lstr "34856@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "Indicates the Opto-Electric Conversion Function (OECF) specified in ISO 14524. OECF is the relationship between the camera optical input and the image values.@en",
   :rdfs/label #voc/lstr "OECF@en",
   :rdfs/subPropertyOf [:exif/pictTaking :exif/oecf :exif/exifAttribute]})

(def orientation
  "The image orientation viewed in terms of rows and columns."
  {:db/ident :exif/orientation,
   :exif/tagNumber #voc/lstr "274@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#voc/lstr "画像データがどこ(top-leftなど）を起点として、どの向きで格納されているか@ja"
    #voc/lstr "The image orientation viewed in terms of rows and columns.@en"],
   :rdfs/label #voc/lstr "Orientation@en",
   :rdfs/subPropertyOf
   [:exif/imageDataStruct :exif/orientation :exif/exifAttribute]})

(def photometricInterpretation
  "Pixel composition. In JPEG compressed data a JPEG marker is used instead of this tag."
  {:db/ident :exif/photometricInterpretation,
   :exif/tagNumber #voc/lstr "262@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "Pixel composition. In JPEG compressed data a JPEG marker is used instead of this tag.@en",
   :rdfs/label #voc/lstr "PhotometricInterpretation@en",
   :rdfs/subPropertyOf
   [:exif/imageDataStruct :exif/photometricInterpretation :exif/exifAttribute]})

(def pictTaking
  "An attribute relating to Picture-Taking Conditions"
  {:db/ident           :exif/pictTaking,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #voc/lstr
                        "An attribute relating to Picture-Taking Conditions@en",
   :rdfs/label         #voc/lstr "PictTaking@en",
   :rdfs/subPropertyOf [:exif/exifAttribute :exif/pictTaking]})

(def pimBrightness
  "Brightness info for print image matching"
  {:db/ident           :exif/pimBrightness,
   :exif/tagNumber     #voc/lstr "10@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       #voc/lstr "Brightness info for print image matching@en",
   :rdfs/label         #voc/lstr "PrintIM Brightness@en",
   :rdfs/subPropertyOf [:exif/pimInfo :exif/pimBrightness :exif/exifAttribute]})

(def pimColorBalance
  "ColorBalance info for print image matching"
  {:db/ident           :exif/pimColorBalance,
   :exif/tagNumber     #voc/lstr "11@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       #voc/lstr
                        "ColorBalance info for print image matching@en",
   :rdfs/label         #voc/lstr "PrintIM ColorBalance@en",
   :rdfs/subPropertyOf [:exif/pimInfo
                        :exif/pimColorBalance
                        :exif/exifAttribute]})

(def pimContrast
  "Contrast info for print image matching"
  {:db/ident           :exif/pimContrast,
   :exif/tagNumber     #voc/lstr "9@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       #voc/lstr "Contrast info for print image matching@en",
   :rdfs/label         #voc/lstr "PrintIM Contrast@en",
   :rdfs/subPropertyOf [:exif/pimInfo :exif/pimContrast :exif/exifAttribute]})

(def pimInfo
  "An attribute relating to print image matching"
  {:db/ident           :exif/pimInfo,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #voc/lstr
                        "An attribute relating to print image matching@en",
   :rdfs/label         #voc/lstr "PIM Info@en",
   :rdfs/subPropertyOf [:exif/exifAttribute :exif/pimInfo]})

(def pimSaturation
  "Saturation info for print image matching"
  {:db/ident           :exif/pimSaturation,
   :exif/tagNumber     #voc/lstr "12@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       #voc/lstr "Saturation info for print image matching@en",
   :rdfs/label         #voc/lstr "PrintIM Saturation@en",
   :rdfs/subPropertyOf [:exif/pimInfo :exif/pimSaturation :exif/exifAttribute]})

(def pimSharpness
  "Sharpness info for print image matching"
  {:db/ident           :exif/pimSharpness,
   :exif/tagNumber     #voc/lstr "13@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       #voc/lstr "Sharpness info for print image matching@en",
   :rdfs/label         #voc/lstr "PrintIM Sharpness@en",
   :rdfs/subPropertyOf [:exif/pimInfo :exif/pimSharpness :exif/exifAttribute]})

(def pixelXDimension
  "Information specific to compressed data. When a compressed file is recorded, the valid width of the meaningful image shall be recorded in this tag, whether or not there is padding data or a restart marker. This tag should not exist in an uncompressed file."
  {:db/ident :exif/pixelXDimension,
   :exif/tagNumber #voc/lstr "40962@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "Information specific to compressed data. When a compressed file is recorded, the valid width of the meaningful image shall be recorded in this tag, whether or not there is padding data or a restart marker. This tag should not exist in an uncompressed file.@en",
   :rdfs/label #voc/lstr "PixelXDimension@en",
   :rdfs/subPropertyOf [:exif/width
                        :exif/imageConfig
                        :exif/pixelXDimension
                        :exif/exifAttribute
                        :exif/length]})

(def pixelYDimension
  "Information specific to compressed data. When a compressed file is recorded, the valid height of the meaningful image shall be recorded in this tag, whether or not there is padding data or a restart marker. This tag should not exist in an uncompressed file. Since data padding is unnecessary in the vertical direction, the number of lines recorded in this valid image height tag will in fact be the same as that recorded in the SOF."
  {:db/ident :exif/pixelYDimension,
   :exif/tagNumber #voc/lstr "40963@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "Information specific to compressed data. When a compressed file is recorded, the valid height of the meaningful image shall be recorded in this tag, whether or not there is padding data or a restart marker. This tag should not exist in an uncompressed file. Since data padding is unnecessary in the vertical direction, the number of lines recorded in this valid image height tag will in fact be the same as that recorded in the SOF.@en",
   :rdfs/label #voc/lstr "PixelYDimension@en",
   :rdfs/subPropertyOf [:exif/height
                        :exif/imageConfig
                        :exif/pixelYDimension
                        :exif/exifAttribute
                        :exif/length]})

(def planarConfiguration
  "Indicates whether pixel components are recorded in chunky or planar format. In JPEG compressed files a JPEG marker is used instead of this tag. If this field does not exist, the TIFF default of 1 (chunky) is assumed."
  {:db/ident :exif/planarConfiguration,
   :exif/tagNumber #voc/lstr "284@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "Indicates whether pixel components are recorded in chunky or planar format. In JPEG compressed files a JPEG marker is used instead of this tag. If this field does not exist, the TIFF default of 1 (chunky) is assumed.@en",
   :rdfs/label #voc/lstr "PlanarConfiguration@en",
   :rdfs/subPropertyOf
   [:exif/imageDataStruct :exif/planarConfiguration :exif/exifAttribute]})

(def primaryChromaticities
  "The chromaticity of the three primary colors of the image. Normally this tag is not necessary, since color space is specified in the color space information tag (ColorSpace)."
  {:db/ident :exif/primaryChromaticities,
   :exif/tagNumber #voc/lstr "319@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#voc/lstr
     "原色の色度。CCIR REcommendation 709 primariesを使っている場合は、'640/1000,330/1000,300/1000,600/1000,150/1000,60/1000'という値。通常はColorSpaceタグがあるので不要@ja"
    #voc/lstr
     "The chromaticity of the three primary colors of the image. Normally this tag is not necessary, since color space is specified in the color space information tag (ColorSpace).@en"],
   :rdfs/label #voc/lstr "PrimaryChromaticities@en",
   :rdfs/subPropertyOf
   [:exif/imageDataCharacter :exif/primaryChromaticities :exif/exifAttribute]})

(def printImageMatching_IFD_Pointer
  "A pointer to the print image matching IFD"
  {:db/ident           :exif/printImageMatching_IFD_Pointer,
   :exif/tagNumber     #voc/lstr "50341@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       #voc/lstr "A pointer to the print image matching IFD@en",
   :rdfs/label         #voc/lstr "PrintImageMatching IFD Pointer@en",
   :rdfs/subPropertyOf [:exif/ifdPointer
                        :exif/printImageMatching_IFD_Pointer
                        :exif/exifAttribute]})

(def recOffset
  "An attribute relating to recording offset"
  {:db/ident           :exif/recOffset,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #voc/lstr "An attribute relating to recording offset@en",
   :rdfs/label         #voc/lstr "Recording Offset@en",
   :rdfs/subPropertyOf [:exif/exifAttribute :exif/recOffset]})

(def referenceBlackWhite
  "The reference black point value and reference white point value. The color space is declared in a color space information tag, with the default being the value that gives the optimal image characteristics Interoperability these conditions."
  {:db/ident :exif/referenceBlackWhite,
   :exif/tagNumber #voc/lstr "532@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#voc/lstr
     "画像情報の黒点・白点値。YCbCr形式の場合、最初の２つの値がY(輝度)の黒点・白点、次がCb、最後がCrとなり、デフォルト値は'0,255,0,128,0,128'。RGB形式の場合はR、G、Bの順で黒点・白点値が並んでおり、デフォルト値は'0,255,0,255,0,255'。@ja"
    #voc/lstr
     "The reference black point value and reference white point value. The color space is declared in a color space information tag, with the default being the value that gives the optimal image characteristics Interoperability these conditions.@en"],
   :rdfs/label #voc/lstr "ReferenceBlackWhite@en",
   :rdfs/subPropertyOf
   [:exif/imageDataCharacter :exif/referenceBlackWhite :exif/exifAttribute]})

(def relatedFile
  "Tag Relating to Related File Information"
  {:db/ident           :exif/relatedFile,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #voc/lstr "Tag Relating to Related File Information@en",
   :rdfs/label         #voc/lstr "Related File@en",
   :rdfs/subPropertyOf [:exif/exifAttribute :exif/relatedFile]})

(def relatedImageFileFormat
  "Related image file format"
  {:db/ident :exif/relatedImageFileFormat,
   :exif/tagNumber #voc/lstr "4096@en",
   :rdf/type :rdf/Property,
   :rdfs/comment [#voc/lstr
                   "画像フォーマットを'Exif JPEG Ver. 2.1'などの文字列で示す。通常はサムネィル画像に使う@ja"
                  #voc/lstr "Related image file format@en"],
   :rdfs/label #voc/lstr "RelatedImageFileFormat@en",
   :rdfs/subPropertyOf
   [:exif/interopInfo :exif/relatedImageFileFormat :exif/exifAttribute]})

(def relatedImageLength
  "Related image length"
  {:db/ident           :exif/relatedImageLength,
   :exif/tagNumber     #voc/lstr "4098@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       [#voc/lstr "画像高。通常はサムネイル画像のInteroperability IFDに使う@ja"
                        #voc/lstr "Related image length@en"],
   :rdfs/label         #voc/lstr "RelatedImageLength@en",
   :rdfs/subPropertyOf [:exif/height
                        :exif/interopInfo
                        :exif/relatedImageLength
                        :exif/exifAttribute
                        :exif/length]})

(def relatedImageWidth
  "Related image width"
  {:db/ident           :exif/relatedImageWidth,
   :exif/tagNumber     #voc/lstr "4097@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       [#voc/lstr "画像幅。通常はサムネイル画像のInteroperability IFDに使う@ja"
                        #voc/lstr "Related image width@en"],
   :rdfs/label         #voc/lstr "RelatedImageWidth@en",
   :rdfs/subPropertyOf [:exif/width
                        :exif/interopInfo
                        :exif/relatedImageWidth
                        :exif/exifAttribute
                        :exif/length]})

(def relatedSoundFile
  "Related audio file"
  {:db/ident           :exif/relatedSoundFile,
   :exif/tagNumber     #voc/lstr "40964@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       [#voc/lstr "画像と一緒に音声録音できる機種の場合に、音声ファイルの名前@ja"
                        #voc/lstr "Related audio file@en"],
   :rdfs/label         #voc/lstr "RelatedSoundFile@en",
   :rdfs/subPropertyOf [:exif/relatedFile
                        :exif/relatedSoundFile
                        :exif/exifAttribute]})

(def resolution
  "a rational number representing a resolution. Could be a subProperty of other general schema."
  {:db/ident :exif/resolution,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "a rational number representing a resolution. Could be a subProperty of other general schema.@en",
   :rdfs/label #voc/lstr "Resolution@en",
   :rdfs/subPropertyOf :exif/resolution})

(def resolutionUnit
  "The unit for measuring XResolution and YResolution. The same unit is used for both XResolution and YResolution. If the image resolution in unknown, 2 (inches) is designated."
  {:db/ident :exif/resolutionUnit,
   :exif/tagNumber #voc/lstr "296@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#voc/lstr "XResolution/YResolutionの解像度の単位@ja"
    #voc/lstr
     "The unit for measuring XResolution and YResolution. The same unit is used for both XResolution and YResolution. If the image resolution in unknown, 2 (inches) is designated.@en"],
   :rdfs/label #voc/lstr "ResolutionUnit@en",
   :rdfs/subPropertyOf
   [:exif/imageDataStruct :exif/resolutionUnit :exif/exifAttribute]})

(def rowsPerStrip
  "The number of rows per strip. This is the number of rows in the image of one strip when an image is divided into strips. With JPEG compressed data this designation is not needed and is omitted."
  {:db/ident :exif/rowsPerStrip,
   :exif/tagNumber #voc/lstr "278@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "The number of rows per strip. This is the number of rows in the image of one strip when an image is divided into strips. With JPEG compressed data this designation is not needed and is omitted.@en",
   :rdfs/label #voc/lstr "RowsPerStrip@en",
   :rdfs/subPropertyOf
   [:exif/recOffset :exif/rowsPerStrip :exif/exifAttribute]})

(def samplesPerPixel
  "The number of components per pixel. Since this standard applies to RGB and YCbCr images, the value set for this tag is 3. In JPEG compressed data a JPEG marker is used instead of this tag."
  {:db/ident :exif/samplesPerPixel,
   :exif/tagNumber #voc/lstr "277@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "The number of components per pixel. Since this standard applies to RGB and YCbCr images, the value set for this tag is 3. In JPEG compressed data a JPEG marker is used instead of this tag.@en",
   :rdfs/label #voc/lstr "SamplesPerPixel@en",
   :rdfs/subPropertyOf
   [:exif/imageDataStruct :exif/samplesPerPixel :exif/exifAttribute]})

(def saturation
  "The direction of saturation processing applied by the camera when the image was shot."
  {:db/ident :exif/saturation,
   :exif/tagNumber #voc/lstr "41993@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "The direction of saturation processing applied by the camera when the image was shot.@en",
   :rdfs/label #voc/lstr "Saturation@en",
   :rdfs/subPropertyOf [:exif/pictTaking :exif/saturation :exif/exifAttribute]})

(def sceneCaptureType
  "The type of scene that was shot. It can also be used to record the mode in which the image was shot, such as Landscape, Portrait etc. Note that this differs from the scene type (SceneType) tag."
  {:db/ident :exif/sceneCaptureType,
   :exif/tagNumber #voc/lstr "41990@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "The type of scene that was shot. It can also be used to record the mode in which the image was shot, such as Landscape, Portrait etc. Note that this differs from the scene type (SceneType) tag.@en",
   :rdfs/label #voc/lstr "SceneCaptureType@en",
   :rdfs/subPropertyOf
   [:exif/pictTaking :exif/sceneCaptureType :exif/exifAttribute]})

(def sceneType
  "The type of scene. If a DSC recorded the image, this tag value shall always be set to 1, indicating that the image was directly photographed."
  {:db/ident :exif/sceneType,
   :exif/tagNumber #voc/lstr "41729@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#voc/lstr "画像がどうやって撮られたか。デジカメの場合は通常1=A directly photographed image@ja"
    #voc/lstr
     "The type of scene. If a DSC recorded the image, this tag value shall always be set to 1, indicating that the image was directly photographed.@en"],
   :rdfs/label #voc/lstr "SceneType@en",
   :rdfs/subPropertyOf [:exif/pictTaking :exif/sceneType :exif/exifAttribute]})

(def seconds
  "a mesurement of time length with unit of second"
  {:db/ident           :exif/seconds,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #voc/lstr
                        "a mesurement of time length with unit of second@en",
   :rdfs/label         #voc/lstr "Seconds@en",
   :rdfs/subPropertyOf :exif/seconds})

(def sensingMethod
  "The image sensor type on the camera or input device, such as One-chip color area sensor etc."
  {:db/ident :exif/sensingMethod,
   :exif/tagNumber #voc/lstr "41495@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#voc/lstr
     "イメージセンサーの形式。One-chip color area sensor、Color sequential area sensor、Trilinear sensorなど@ja"
    #voc/lstr
     "The image sensor type on the camera or input device, such as One-chip color area sensor etc.@en"],
   :rdfs/label #voc/lstr "SensingMethod@en",
   :rdfs/subPropertyOf
   [:exif/pictTaking :exif/sensingMethod :exif/exifAttribute]})

(def sharpness
  "The direction of sharpness processing applied by the camera when the image was shot."
  {:db/ident :exif/sharpness,
   :exif/tagNumber #voc/lstr "41994@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "The direction of sharpness processing applied by the camera when the image was shot.@en",
   :rdfs/label #voc/lstr "Sharpness@en",
   :rdfs/subPropertyOf [:exif/pictTaking :exif/sharpness :exif/exifAttribute]})

(def shutterSpeedValue
  "Shutter speed. The unit is the APEX (Additive System of Photographic Exposure) setting"
  {:db/ident :exif/shutterSpeedValue,
   :exif/tagNumber #voc/lstr "37377@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#voc/lstr
     "シャッター速度（APEX値）。この値の2のベキ乗をとって逆数にすると、通常のシャッター速度表示になる。例えば'4'の場合だと1/(2^4)=1/16秒@ja"
    #voc/lstr
     "Shutter speed. The unit is the APEX (Additive System of Photographic Exposure) setting@en"],
   :rdfs/label #voc/lstr "ShutterSpeedValue@en",
   :rdfs/subPropertyOf
   [:exif/pictTaking :exif/shutterSpeedValue :exif/exifAttribute]})

(def software
  "The name and version of the software or firmware of the camera or image input device used to generate the image."
  {:db/ident :exif/software,
   :exif/tagNumber #voc/lstr "305@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#voc/lstr "デジカメ（もしくは入力機器）の内蔵ソフトウェア/ファームウェアの名称とバージョン@ja"
    #voc/lstr
     "The name and version of the software or firmware of the camera or image input device used to generate the image.@en"],
   :rdfs/label #voc/lstr "Software@en",
   :rdfs/subPropertyOf [:rdfs/label :exif/exifAttribute :exif/software]})

(def spatialFrequencyResponse
  "This tag records the camera or input device spatial frequency table and SFR values in the direction of image width, image height, and diagonal direction, as specified in ISO 12233."
  {:db/ident :exif/spatialFrequencyResponse,
   :exif/tagNumber #voc/lstr "41484@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "This tag records the camera or input device spatial frequency table and SFR values in the direction of image width, image height, and diagonal direction, as specified in ISO 12233.@en",
   :rdfs/label #voc/lstr "SpatialFrequencyResponse@en",
   :rdfs/subPropertyOf
   [:exif/pictTaking :exif/spatialFrequencyResponse :exif/exifAttribute]})

(def spectralSensitivity
  "Indicates the spectral sensitivity of each channel of the camera used. The tag value is an ASCII string compatible with the standard developed by the ASTM Technical committee."
  {:db/ident :exif/spectralSensitivity,
   :exif/tagNumber #voc/lstr "34852@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "Indicates the spectral sensitivity of each channel of the camera used. The tag value is an ASCII string compatible with the standard developed by the ASTM Technical committee.@en",
   :rdfs/label #voc/lstr "SpectralSensitivity@en",
   :rdfs/subPropertyOf
   [:exif/pictTaking :exif/spectralSensitivity :exif/exifAttribute]})

(def stripByteCounts
  "The total number of bytes in each strip. With JPEG compressed data this designation is not needed and is omitted."
  {:db/ident :exif/stripByteCounts,
   :exif/tagNumber #voc/lstr "279@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "The total number of bytes in each strip. With JPEG compressed data this designation is not needed and is omitted.@en",
   :rdfs/label #voc/lstr "StripByteCounts@en",
   :rdfs/subPropertyOf
   [:exif/recOffset :exif/stripByteCounts :exif/exifAttribute]})

(def stripOffsets
  "For each strip, the byte offset of that strip. With JPEG compressed data this designation is not needed and is omitted."
  {:db/ident :exif/stripOffsets,
   :exif/tagNumber #voc/lstr "273@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "For each strip, the byte offset of that strip. With JPEG compressed data this designation is not needed and is omitted.@en",
   :rdfs/label #voc/lstr "StripOffsets@en",
   :rdfs/subPropertyOf
   [:exif/recOffset :exif/stripOffsets :exif/exifAttribute]})

(def subSecTime
  "DateTime subseconds"
  {:db/ident           :exif/subSecTime,
   :exif/tagNumber     #voc/lstr "37520@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       #voc/lstr "DateTime subseconds@en",
   :rdfs/label         #voc/lstr "SubSecTime@en",
   :rdfs/subPropertyOf [:exif/subsecond
                        :exif/dateAndOrTime
                        :exif/subSecTime
                        :exif/exifAttribute]})

(def subSecTimeDigitized
  "DateTimeDigitized subseconds"
  {:db/ident           :exif/subSecTimeDigitized,
   :exif/tagNumber     #voc/lstr "37522@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       #voc/lstr "DateTimeDigitized subseconds@en",
   :rdfs/label         #voc/lstr "SubSecTimeDigitized@en",
   :rdfs/subPropertyOf [:exif/subsecond
                        :exif/dateAndOrTime
                        :exif/subSecTimeDigitized
                        :exif/exifAttribute]})

(def subSecTimeOriginal
  "DateTimeOriginal subseconds"
  {:db/ident           :exif/subSecTimeOriginal,
   :exif/tagNumber     #voc/lstr "37521@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       #voc/lstr "DateTimeOriginal subseconds@en",
   :rdfs/label         #voc/lstr "SubSecTimeOriginal@en",
   :rdfs/subPropertyOf [:exif/subsecond
                        :exif/dateAndOrTime
                        :exif/subSecTimeOriginal
                        :exif/exifAttribute]})

(def subjectArea
  "The location and area of the main subject in the overall scene."
  {:db/ident :exif/subjectArea,
   :exif/tagNumber #voc/lstr "37396@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#voc/lstr "画面中の主たる被写体の位置。2値によるXY座標、3値による円、4値による長方形座標の3通りの示し方がある@ja"
    #voc/lstr
     "The location and area of the main subject in the overall scene.@en"],
   :rdfs/label #voc/lstr "SubjectArea@en",
   :rdfs/subPropertyOf
   [:exif/pictTaking :exif/subjectArea :exif/exifAttribute]})

(def subjectDistance
  "The distance to the subject, given in meters. Note that if the numerator of the recorded value is FFFFFFFF.H, Infinity shall be indicated; and if the numerator is 0, Distance unknown shall be indicated."
  {:db/ident :exif/subjectDistance,
   :exif/tagNumber #voc/lstr "37382@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#voc/lstr "被写体までの距離。単位はm@ja"
    #voc/lstr
     "The distance to the subject, given in meters. Note that if the numerator of the recorded value is FFFFFFFF.H, Infinity shall be indicated; and if the numerator is 0, Distance unknown shall be indicated.@en"],
   :rdfs/label #voc/lstr "SubjectDistance@en",
   :rdfs/subPropertyOf [:exif/meter
                        :exif/pictTaking
                        :exif/subjectDistance
                        :exif/exifAttribute
                        :exif/length]})

(def subjectDistanceRange
  "The distance to the subject, such as Macro, Close View or Distant View."
  {:db/ident :exif/subjectDistanceRange,
   :exif/tagNumber #voc/lstr "41996@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "The distance to the subject, such as Macro, Close View or Distant View.@en",
   :rdfs/label #voc/lstr "SubjectDistanceRange@en",
   :rdfs/subPropertyOf
   [:exif/pictTaking :exif/subjectDistanceRange :exif/exifAttribute]})

(def subjectLocation
  "The location of the main subject in the scene. The value of this tag represents the pixel at the center of the main subject relative to the left edge, prior to rotation processing as per the Rotation tag. The first value indicates the X column number and second indicates the Y row number."
  {:db/ident :exif/subjectLocation,
   :exif/tagNumber #voc/lstr "41492@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#voc/lstr "画面中の主要被写体のXY座標@ja"
    #voc/lstr
     "The location of the main subject in the scene. The value of this tag represents the pixel at the center of the main subject relative to the left edge, prior to rotation processing as per the Rotation tag. The first value indicates the X column number and second indicates the Y row number.@en"],
   :rdfs/label #voc/lstr "SubjectLocation@en",
   :rdfs/subPropertyOf
   [:exif/pictTaking :exif/subjectLocation :exif/exifAttribute]})

(def subsecond
  {:db/ident :exif/subsecond,
   :rdf/type :rdf/Property,
   :rdfs/subPropertyOf :exif/subsecond})

(def subseconds
  "A tag used to record fractions of seconds for a date property"
  {:db/ident :exif/subseconds,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr "A tag used to record fractions of seconds for a date property@en",
   :rdfs/label #voc/lstr "Subseconds@en",
   :rdfs/subPropertyOf :exif/subseconds})

(def tag_number
  "The Exif tag number"
  {:db/ident           :exif/tag_number,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #voc/lstr "The Exif tag number@en",
   :rdfs/label         #voc/lstr "Tag number@en",
   :rdfs/subPropertyOf [:dc11/identifier :exif/tag_number]})

(def tagid
  "The Exif tag number with context prefix, such as IFD type or maker name"
  {:db/ident :exif/tagid,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "The Exif tag number with context prefix, such as IFD type or maker name@en",
   :rdfs/label #voc/lstr "Tag ID@en",
   :rdfs/subPropertyOf [:exif/tag_number :exif/tagid :dc11/identifier]})

(def transferFunction
  "A transfer function for the image, described in tabular style. Normally this tag is not necessary, since color space is specified in the color space information tag (ColorSpace)."
  {:db/ident :exif/transferFunction,
   :exif/tagNumber #voc/lstr "301@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "A transfer function for the image, described in tabular style. Normally this tag is not necessary, since color space is specified in the color space information tag (ColorSpace).@en",
   :rdfs/label #voc/lstr "TransferFunction@en",
   :rdfs/subPropertyOf
   [:exif/imageDataCharacter :exif/transferFunction :exif/exifAttribute]})

(def userComment
  "A tag for Exif users to write keywords or comments on the image besides those in ImageDescription, and without the character code limitations of the ImageDescription tag. The character code used in the UserComment tag is identified based on an ID code in a fixed 8-byte area at the start of the tag data area."
  {:db/ident :exif/userComment,
   :exif/tagNumber #voc/lstr "37510@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#voc/lstr
     "ユーザーコメント。ImageDescriptionタグと違って、こちらはJIS2バイトコード、Unicode等での記述が許されており、最初の8バイトが文字コード@ja"
    #voc/lstr
     "A tag for Exif users to write keywords or comments on the image besides those in ImageDescription, and without the character code limitations of the ImageDescription tag. The character code used in the UserComment tag is identified based on an ID code in a fixed 8-byte area at the start of the tag data area.@en"],
   :rdfs/label #voc/lstr "UserComment@en",
   :rdfs/subPropertyOf [:exif/userInfo :exif/userComment :exif/exifAttribute]})

(def userInfo
  "An attribute relating to User Information"
  {:db/ident           :exif/userInfo,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #voc/lstr "An attribute relating to User Information@en",
   :rdfs/label         #voc/lstr "User Info@en",
   :rdfs/subPropertyOf [:exif/exifAttribute :exif/userInfo]})

(def versionInfo
  "An attribute relating to Version"
  {:db/ident           :exif/versionInfo,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #voc/lstr "An attribute relating to Version@en",
   :rdfs/label         #voc/lstr "Version Info@en",
   :rdfs/subPropertyOf [:exif/exifAttribute :exif/versionInfo]})

(def whiteBalance
  "The white balance mode set when the image was shot."
  {:db/ident :exif/whiteBalance,
   :exif/tagNumber #voc/lstr "41987@en",
   :rdf/type :rdf/Property,
   :rdfs/comment [#voc/lstr "ホワイトバランスのモード@ja"
                  #voc/lstr
                   "The white balance mode set when the image was shot.@en"],
   :rdfs/label #voc/lstr "WhiteBalance@en",
   :rdfs/subPropertyOf
   [:exif/pictTaking :exif/whiteBalance :exif/exifAttribute]})

(def whitePoint
  "The chromaticity of the white point of the image. Normally this tag is not necessary, since color space is specified in the color space information tag (ColorSpace)."
  {:db/ident :exif/whitePoint,
   :exif/tagNumber #voc/lstr "318@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#voc/lstr
     "白点の色度。CIE Standard Illuminant D65(いわゆる昼光色の世界標準値)を使っていれば、'3127/10000,3290/10000'という値。通常はColorSpaceタグがあるので不要@ja"
    #voc/lstr
     "The chromaticity of the white point of the image. Normally this tag is not necessary, since color space is specified in the color space information tag (ColorSpace).@en"],
   :rdfs/label #voc/lstr "WhitePoint@en",
   :rdfs/subPropertyOf
   [:exif/imageDataCharacter :exif/whitePoint :exif/exifAttribute]})

(def width
  "Width of an object"
  {:db/ident           :exif/width,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #voc/lstr "Width of an object@en",
   :rdfs/label         #voc/lstr "Width@en",
   :rdfs/subPropertyOf [:exif/length :exif/width]})

(def xResolution
  "The number of pixels per ResolutionUnit in the ImageWidth direction. When the image resolution is unknown, 72 [dpi] is designated."
  {:db/ident :exif/xResolution,
   :exif/tagNumber #voc/lstr "282@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#voc/lstr "画像の表示・印刷時の水平解像度@ja"
    #voc/lstr
     "The number of pixels per ResolutionUnit in the ImageWidth direction. When the image resolution is unknown, 72 [dpi] is designated.@en"],
   :rdfs/label #voc/lstr "XResolution@en",
   :rdfs/subPropertyOf [:exif/resolution
                        :exif/imageDataStruct
                        :exif/xResolution
                        :exif/exifAttribute]})

(def yCbCrCoefficients
  "The matrix coefficients for transformation from RGB to YCbCr image data."
  {:db/ident :exif/yCbCrCoefficients,
   :exif/tagNumber #voc/lstr "529@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#voc/lstr "RGB形式からYCbCr形式に変換するための3つの係数。通常は0.299、0.587、0.114という値@ja"
    #voc/lstr
     "The matrix coefficients for transformation from RGB to YCbCr image data.@en"],
   :rdfs/label #voc/lstr "YCbCrCoefficients@en",
   :rdfs/subPropertyOf
   [:exif/imageDataCharacter :exif/yCbCrCoefficients :exif/exifAttribute]})

(def yCbCrPositioning
  "The position of chrominance components in relation to the luminance component. This field is designated only for JPEG compressed data or uncompressed YCbCr data."
  {:db/ident :exif/yCbCrPositioning,
   :exif/tagNumber #voc/lstr "531@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#voc/lstr
     "色情報のサンプリングを間引きしている場合に、色情報のサンプルポイントがどこになるか。1='centered'なら点集合の中央、2＝'co-sited'なら点集合の原点@ja"
    #voc/lstr
     "The position of chrominance components in relation to the luminance component. This field is designated only for JPEG compressed data or uncompressed YCbCr data.@en"],
   :rdfs/label #voc/lstr "YCbCrPositioning@en",
   :rdfs/subPropertyOf
   [:exif/imageDataStruct :exif/yCbCrPositioning :exif/exifAttribute]})

(def yCbCrSubSampling
  "The sampling ratio of chrominance components in relation to the luminance component. In JPEG compressed data a JPEG marker is used instead of this tag."
  {:db/ident :exif/yCbCrSubSampling,
   :exif/tagNumber #voc/lstr "530@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "The sampling ratio of chrominance components in relation to the luminance component. In JPEG compressed data a JPEG marker is used instead of this tag.@en",
   :rdfs/label #voc/lstr "YCbCrSubSampling@en",
   :rdfs/subPropertyOf
   [:exif/imageDataStruct :exif/yCbCrSubSampling :exif/exifAttribute]})

(def yResolution
  "The number of pixels per ResolutionUnit in the ImageLength direction. The same value as XResolution is designated."
  {:db/ident :exif/yResolution,
   :exif/tagNumber #voc/lstr "283@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#voc/lstr "画像の表示・印刷時の垂直解像度@ja"
    #voc/lstr
     "The number of pixels per ResolutionUnit in the ImageLength direction. The same value as XResolution is designated.@en"],
   :rdfs/label #voc/lstr "YResolution@en",
   :rdfs/subPropertyOf [:exif/resolution
                        :exif/imageDataStruct
                        :exif/yResolution
                        :exif/exifAttribute]})